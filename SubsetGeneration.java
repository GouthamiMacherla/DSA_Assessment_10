/*
 * <aside>
💡 **Question 3**

****Given a set represented as a string, write a recursive code to print all subsets of it. The subsets can be printed in any order.

**Example 1:**

Input :  set = “abc”

Output : { “”, “a”, “b”, “c”, “ab”, “ac”, “bc”, “abc”}

**Example 2:**

Input : set = “abcd”

Output : { “”, “a” ,”ab” ,”abc” ,”abcd”, “abd” ,”ac” ,”acd”, “ad” ,”b”, “bc” ,”bcd” ,”bd” ,”c” ,”cd” ,”d” }

</aside>
 * 
 */

package in.ineuron.gouthami;

import java.util.ArrayList;
import java.util.List;

public class SubsetGeneration {
    public static List<String> generateSubsets(String set) {
        List<String> subsets = new ArrayList<>();
        generateSubsetsHelper(set, 0, "", subsets);
        return subsets;
    }

    private static void generateSubsetsHelper(String set, int index, String currentSubset, List<String> subsets) {
        if (index == set.length()) {
            subsets.add(currentSubset);
            return;
        }

        // Include the current character in the subset
        generateSubsetsHelper(set, index + 1, currentSubset + set.charAt(index), subsets);

        // Exclude the current character from the subset
        generateSubsetsHelper(set, index + 1, currentSubset, subsets);
    }

    public static void main(String[] args) {
        // Testing the code
        String[] testCases = {"abc", "abcd"};
        for (String set : testCases) {
            List<String> subsets = generateSubsets(set);
            System.out.println("Subsets of " + set + ": " + subsets);
        }
    }
}
