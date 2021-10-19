import java.io.File;
import java.io.PrintWriter;
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
        ArrayList<Integer> = arrayListCreate(pList.size(), 0);
        int i = 0;
        int k = 0;
        do{
            

        } while(i < pList.size());
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
    private void writeOutputFile(String pFilename, ArrayList<Integer> pListRuns){

    }

    /*
    *reads a file and records RUNS_UP and RUNS_DN
    * @param pFileName file to be read
    * @param pListRuns a list that will record the RUNS data
    * @return an ArrayList<Integer> with the RUNS data
     */
    private void readInputFile(String pFileName, ArrayList<Integer>  pListRuns){

    }

}
