/*
 * <aside>
💡 **Question 2**

You have a list `arr` of all integers in the range `[1, n]` sorted in a strictly increasing order. Apply the following algorithm on `arr`:

- Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.
- Repeat the previous step again, but this time from right to left, remove the rightmost number and every other number from the remaining numbers.
- Keep repeating the steps again, alternating left to right and right to left, until a single number remains.

Given the integer `n`, return *the last number that remains in* `arr`.

**Example 1:**

```
Input: n = 9
Output: 6
Explanation:
arr = [1, 2,3, 4,5, 6,7, 8,9]
arr = [2,4, 6,8]
arr = [2, 6]
arr = [6]

```

**Example 2:**

</aside>
 * 
 */

package in.ineuron.gouthami;

public class LastRemainingNumber {
    public static int lastRemaining(int n) {
        boolean isLeftToRight = true;
        int remainingNumbers = n;
        int step = 1;
        int head = 1;

        while (remainingNumbers > 1) {
            if (isLeftToRight || remainingNumbers % 2 == 1) {
                head += step;
            }

            remainingNumbers /= 2;
            step *= 2;
            isLeftToRight = !isLeftToRight;
        }

        return head;
    }

    public static void main(String[] args) {
        // Testing the code
        int[] testCases = {9, 5};
        for (int n : testCases) {
            int lastNumber = lastRemaining(n);
            System.out.println("Last number that remains in arr for n = " + n + ": " + lastNumber);
        }
    }
}

