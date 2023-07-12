/*
 * <aside>
💡 **Question 4**

Given a string calculate length of the string using recursion.

**Examples:**

</aside>
 * 
 */

package in.ineuron.gouthami;

public class StringLength {
    public static int calculateLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        return 1 + calculateLength(str.substring(1));
    }

    public static void main(String[] args) {
        // Testing the code
        String[] testCases = {"Hello", "World", ""};
        for (String str : testCases) {
            int length = calculateLength(str);
            System.out.println("Length of \"" + str + "\": " + length);
        }
    }
}
