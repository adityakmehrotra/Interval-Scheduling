// Non-Weighted Interval Scheduling Problem
// Created By: Aditya Mehrotra
// Last Update: 02/13/2024

import java.util.*;

public class non_weighted_problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInstances = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numInstances; i++) {
            int numJobs = scanner.nextInt();
            int[][] mainArr = new int[numJobs][2];

            for (int j = 0; j < numJobs; j++) {
                mainArr[j][0] = scanner.nextInt();
                mainArr[j][1] = scanner.nextInt();
            }

            Arrays.sort(mainArr, Comparator.comparingDouble(x -> x[1]));

            System.out.println(helper(mainArr));

            if (i < numInstances - 1) {
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private static int helper(int[][] intervals) {
        int count = 0;
        int lastEndTime = -1;

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] >= lastEndTime) {
                count += 1;
                lastEndTime = intervals[i][1];
            }
        }

        return count;
    }
}
