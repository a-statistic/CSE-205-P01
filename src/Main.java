

/**
 *
 * @author rSaucier
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {
        Main mainObject = new Main();
        mainObject.run();

    }
    private void run() {
        ArrayList<Integer> list = RunsTest.readInputFile("/Users/a_statistic/IdeaProjects/CSE-205-P01/p01-in.txt");
        System.out.println(list);
        ArrayList<Integer> listRunsUpCount = RunsTest.findRuns(list, 1);
        ArrayList<Integer> listRunsDnCount = RunsTest.findRuns(list, -1);
        ArrayList<Integer> listRunsCount = RunsTest.mergeLists(listRunsUpCount, listRunsDnCount);
        RunsTest.writeOutputFile("p01-runs.txt", listRunsCount);

    }

}
