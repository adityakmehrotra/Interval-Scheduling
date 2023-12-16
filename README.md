# Interval-Scheduling
Solving the Interval Scheduling problem optimally, as well as solving the Weighted Interval Scheduling problem optimally in time and space.

## Non-Weighted Interval Scheduling Problem

### Problem Input Description
The input will start with an positive integer, giving the number of instances that follow. For each
instance, there will be a positive integer, giving the number of jobs. For each job, there will be a pair of
positive integers i and j, where i < j, and i is the start time, and j is the end time.

### Problem Output Description
For each instance, the program should output the number of intervals scheduled on a separate line.
Each output line should be terminated by a newline.

### Sample Input
2<br>
1<br>
1 4<br>
3<br>
1 2<br>
3 4<br>
2 6

### Sample Output
1<br>
2

### Sample Input and Output Description
The sample input has two instances. The first instance has one job to schedule with a start time of 1 and an end time of 4. The second instance has 3 jobs.

### Time Complexity
The time complexity of the optimal weighted interval scheduling problem is **O(n * log(n))**.


## Weighted Interval Scheduling Problem

### Problem Input Description
The input will start with an positive integer, giving the number of instances that follow. For each instance, there will be a positive integer, giving the number of jobs. For each job, there will be a trio of positive integers i, j and k, where i < j, and i is the start time, j is the end time, and k is the weight.

### Problem Output Description
The objective of the problem is to determine a schedule of non-overlapping intervals with maximum weight and to return this maximum weight. For each instance, your program should output the total weight of the intervals scheduled on a separate line. Each output line should be terminated by exactly one newline.

### Sample Input
2<br>
1<br>
1 4 5<br>
3<br>
1 2 1<br>
3 4 2<br>
2 6 4

### Sample Output
5<br>
5

### Sample Input and Output Description
The sample input has two instances. The first instance has one job to schedule with a start time of 1, an end time of 4, and a weight of 5. The second instance has 3 jobs.

### Time Complexity
The time complexity of the optimal weighted interval scheduling problem is **O(n^2)**.

### Run the Code
- Downloard the required files:
- You can run the `weighted_problem.java` file through your IDE/Console.
- You can use the Makefile to build the Java file (Furthest_Algorithm.java) through the compiler and run the algorithm in the Java file (Furthest_Algorithm.java).
