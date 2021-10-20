import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Main mainObject = new Main();

    }
    private void run(){

    }
    /*
    * finds the number of RUNS_UP and RUNS_DN in a given list of Integers
    *@param pList the ArrayList of ints read from a file
    *@param pDir is an int indicating RUNS_UP or RUNS_DN
    *@return ArrayList of ints that indicates the number of runs
     */
    private ArrayList<Integer> findRuns(ArrayList<Integer> pList, int pDir){
        ArrayList<Integer> runs = arrayListCreate(pList.size(), 0);
        int i = 0;
        int k = 0;
        do{
            i = pList.size(); //no idea how to implement this code, this is to make it work so I can continue the rest of the program.

        } while(i < pList.size());
        return runs;
    }
    /*
    * merges two lists containing the RUNS_UP and RUNS_DN count
    * @param pListRunsUpCount an ArrayList containing RUNS_UP count
    * @param pListRunsDownCount an ArrayList containing RUNS_DOWN count
    * @return a single ArrayList<Integer> containing both RUNS_UP and RUNS_DOWN counts
     */
    private ArrayList<Integer> mergeLists(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDownCount) {

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
    private void writeOutputFile(String pFileName, ArrayList<Integer> pListRuns) throws IOException {
        PrintWriter out = new PrintWriter(pFileName);
        int runsTotal = sumArray(pListRuns);
        out.println("runs_total: " + runsTotal);
        for(int k = 0; k < pListRuns.size(); k++) {
            out.println("runs_" + k + ": " + pListRuns.get(k));
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
    private ArrayList<Integer> readInputFile(String pFileName, ArrayList<Integer>  pListRuns) throws FileNotFoundException {
        File in = new File(pFileName);
        ArrayList<Integer> list = new ArrayList<>();
        Scanner read = new Scanner(in);
        while (read.hasNextInt()) {
            list.add(read.nextInt());
        }
        read.close();
        return list;

    }

}
