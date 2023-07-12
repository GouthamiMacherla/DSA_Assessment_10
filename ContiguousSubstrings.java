/*
 * <aside>
💡 **Question 5**

We are given a string S, we need to find count of all contiguous substrings starting and ending with same character.

**Examples :**

</aside>
 * 
 */

package in.ineuron.gouthami;

public class ContiguousSubstrings {
    public static int countSubstrings(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char startChar = str.charAt(i);

            for (int j = i; j < str.length(); j++) {
                char endChar = str.charAt(j);

                if (startChar == endChar) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Testing the code
        String[] testCases = {"abc", "aba", "aaaa"};
        for (String str : testCases) {
            int count = countSubstrings(str);
            System.out.println("Count of contiguous substrings in \"" + str + "\": " + count);
        }
    }
}
