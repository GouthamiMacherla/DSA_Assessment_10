/*
 * <aside>
💡 **Question 8**

Given a string, count total number of consonants in it. A consonant is an English alphabet character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, and g.

**Examples :**

</aside>
 * 
 */

package in.ineuron.gouthami;

public class ConsonantCount {
    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isConsonant(ch)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isConsonant(char ch) {
        return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        // Testing the code
        String[] testCases = {"Hello", "OpenAI", "Consonants"};
        for (String str : testCases) {
            int count = countConsonants(str);
            System.out.println("Number of consonants in \"" + str + "\": " + count);
        }
    }
}

