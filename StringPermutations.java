/*
 * <aside>
💡 **Question 7**

Given a string **str**, the task is to print all the permutations of **str**. A **permutation** is an arrangement of all or part of a set of objects, with regard to the order of the arrangement. For instance, the words ‘bat’ and ‘tab’ represents two distinct permutation (or arrangements) of a similar three letter word.

**Examples:**

> Input: str = “cd”
> 
> 
> **Output:** cd dc
> 
> **Input:** str = “abb”
> 
> **Output:** abb abb bab bba bab bba
> 
</aside>
 * 
 */

package in.ineuron.gouthami;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static List<String> findPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        findPermutationsHelper(str.toCharArray(), 0, permutations);
        return permutations;
    }

    private static void findPermutationsHelper(char[] arr, int index, List<String> permutations) {
        if (index == arr.length - 1) {
            permutations.add(String.valueOf(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            findPermutationsHelper(arr, index + 1, permutations);
            swap(arr, index, i); // backtrack
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Testing the code
        String[] testCases = {"cd", "abb"};
        for (String str : testCases) {
            List<String> permutations = findPermutations(str);
            System.out.println("Permutations of " + str + ": " + permutations);
        }
    }
}

