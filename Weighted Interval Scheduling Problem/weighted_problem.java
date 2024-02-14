// Weighted Interval Scheduling Problem
// Created By: Aditya Mehrotra

import java.util.*;

public class weighted_problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInstances = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numInstances; i++) {
            int numJobs = scanner.nextInt();
            int[][] mainArr = new int[numJobs][2];
            HashMap<int[], Integer> mapper = new HashMap<>();

            for (int j = 0; j < numJobs; j++) {
                mainArr[j][0] = scanner.nextInt();
                mainArr[j][1] = scanner.nextInt();
                mapper.put(mainArr[j], scanner.nextInt());
            }

            System.out.println(helper(mapper, mainArr));

            if (i < numInstances - 1) {
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    public static int helper(HashMap<int[], Integer> mapper, int[][] times) {
        Arrays.sort(times, Comparator.comparingDouble(x -> x[1]));
        int[] checks = new int[times.length];
        checks[0] = mapper.get(times[0]);

        for (int i = 1; i < times.length; i++) {
            int weight = mapper.get(times[i]);
            int finalVal = -1;
            for (int j = 0; j < i; j++) {
                if (times[i][0] >= times[j][1]) {
                    finalVal = j;
                }
            }
            if (finalVal != -1) {
                weight += checks[finalVal];
            }
            checks[i] = Math.max(weight, checks[i - 1]);
        }
        return checks[times.length - 1];
    }
}
