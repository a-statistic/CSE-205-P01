import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    private final int RUNS_UP = 1;
    private final int RUNS_DN = -1;

    public static void main(String[] args)  {
        Main mainObject = new Main();
        mainObject.run();

    }
    private void run() {
        ArrayList<Integer> list = readInputFile("/Documents/CSE205/cse-205/input/p01-in.txt");
        ArrayList<Integer> listRunsUpCount = findRuns(list, RUNS_UP);
        ArrayList<Integer> listRunsDnCount = findRuns(list, RUNS_DN);
        ArrayList<Integer> listRunsCount = mergeLists(listRunsUpCount, listRunsDnCount);
        writeOutputFile("p01-runs.txt", listRunsCount);

    }
    /*
    * finds the number of RUNS_UP and RUNS_DN in a given list of Integers
    *@param pList the ArrayList of ints read from a file
    *@param pDir is an int indicating RUNS_UP or RUNS_DN
    *@return ArrayList of ints that indicates the number of runs
     */
    private ArrayList<Integer> findRuns(ArrayList<Integer> pList, int pDir){
        ArrayList<Integer> listRunsCount = arrayListCreate(pList.size(), 0);
        int i = 0;
        int k = 0;
        do{
            while (i < pList.size()-1) {

                if (pDir == RUNS_UP && pList.get(i) <= pList.get(i+1)) {
                    k++;
                }
                else if (pDir == RUNS_DN && pList.get(i) >= pList.get(i+1)){
                    k++;
                }
                else {
                    if (k != 0) {
                        int value1 = listRunsCount.get(k);
                        value1++;
                        listRunsCount.set(k, value1);
                    }
                }
                i++;
            }
        } while(i < pList.size());
        if (k !=0){
          int value2 = listRunsCount.get(k);
          value2++;
          listRunsCount.set(k, value2);
        }
        return listRunsCount;
    }
    /*
    * merges two lists containing the RUNS_UP and RUNS_DN count
    * @param pListRunsUpCount an ArrayList containing RUNS_UP count
    * @param pListRunsDownCount an ArrayList containing RUNS_DOWN count
    * @return a single ArrayList<Integer> containing both RUNS_UP and RUNS_DOWN counts
     */
    private ArrayList<Integer> mergeLists(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDownCount) {
        ArrayList<Integer> listRunsCount = arrayListCreate(pListRunsUpCount.size(), 0);
        for (int i = 0; i < pListRunsUpCount.size()-1; i++) {
            listRunsCount.set(i, (pListRunsUpCount.get(i) + pListRunsDownCount.get(i)));
        }
        return listRunsCount;
    }

    /*
    *creates and arraylist with an initial value
    * @param pSize integer indicating desired size of the array
    * @param pInitValue the initial value that all elements of the array should contain
    * @return an arraylist with requested values
     */
    private ArrayList<Integer> arrayListCreate(int pSize, int pInitValue){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < pSize; i++) {
            newList.add(pInitValue);
        }
        return newList;
    }

    /*
    *writes file indicating total runs
    * @param pFilename name of file to be written to
    * @param pListRuns the merged list of RUNS_UP and RUNS_down information to be written
     */
    private void writeOutputFile(String pFileName, ArrayList<Integer> pListRuns)  {
        PrintWriter out = null;
        try {
            out = new PrintWriter(pFileName);
            int runsTotal = sumArray(pListRuns);
            out.println("runs_total: " + runsTotal);
            for(int k = 0; k < pListRuns.size(); k++) {
                out.println("runs_" + k + ": " + pListRuns.get(k));
            }
        } catch(IOException e){
            System.out.println("An error occured: " + e.getMessage());
        }

        out.close();

    }

    /*
    *sums all the integers in an ArrayList<Integer>
    *@param pList an ArrayList<Integer> to be summed
    * @return the sum of all ints in the ArrayList
     */
    private int sumArray(ArrayList<Integer> pList) {
        int sum = 0;
        for (int i = 0; i < pList.size(); i++) {
            sum += pList.get(i);
        }
        return sum;
    }

    /*
    *reads a file and records RUNS_UP and RUNS_DN
    * @param pFileName file to be read
    * @param pListRuns a list that will record the RUNS data
    * @return an ArrayList<Integer> with the RUNS data
     */
    private ArrayList<Integer> readInputFile(String pFileName) {
        File in = new File(pFileName);
        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner read = new Scanner(in)){

            while (read.hasNextInt()) {
                list.add(read.nextInt());
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());

        }

        return list;

    }

}
