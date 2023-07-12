/*
 * <aside>
💡 **Question 6**

The [tower of Hanoi](https://en.wikipedia.org/wiki/Tower_of_Hanoi) is a famous puzzle where we have three rods and **N** disks. The objective of the puzzle is to move the entire stack to another rod. You are given the number of discs **N**. Initially, these discs are in the rod 1. You need to print all the steps of discs movement so that all the discs reach the 3rd rod. Also, you need to find the total moves.**Note:** The discs are arranged such that the **top disc is numbered 1** and the **bottom-most disc is numbered N**. Also, all the discs have **different sizes** and a bigger disc **cannot** be put on the top of a smaller disc. Refer the provided link to get a better clarity about the puzzle.

**Example 1:**

```
Input:
N = 2
Output:
move disk 1 from rod 1 to rod 2
move disk 2 from rod 1 to rod 3
move disk 1 from rod 2 to rod 3
3
Explanation:For N=2 , steps will be
as follows in the example and total
3 steps will be taken.
```

**Example 2:**

</aside>
 * 
 */

package in.ineuron.gouthami;

public class TowerOfHanoi {
    public static void towerOfHanoi(int N, char source, char destination, char auxiliary) {
        if (N == 1) {
            System.out.println("move disk 1 from rod " + source + " to rod " + destination);
            return;
        }

        towerOfHanoi(N - 1, source, auxiliary, destination);
        System.out.println("move disk " + N + " from rod " + source + " to rod " + destination);
        towerOfHanoi(N - 1, auxiliary, destination, source);
    }

    public static int totalMoves(int N) {
        return (int) Math.pow(2, N) - 1;
    }

    public static void main(String[] args) {
        // Testing the code
        int[] testCases = {2, 3};
        for (int N : testCases) {
            System.out.println("Steps for N = " + N + ":");
            towerOfHanoi(N, '1', '3', '2');
            int moves = totalMoves(N);
            System.out.println("Total moves: " + moves);
            System.out.println();
        }
    }
}
