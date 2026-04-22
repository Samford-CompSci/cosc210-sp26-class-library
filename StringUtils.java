/**
 * A shared class utility library.
 * COSC 210 — Day 6 Collaborative Exercise
 *
 * Each student will add one method to this class via a pull request.
 * Follow the Javadoc format of the existing method exactly.
 * Do not modify any existing methods.
 */
public class StringUtils {

    /**
     * Returns true if the given string is a palindrome (reads the same forwards and backwards).
     * Ignores case. Example: isPalindrome("Racecar") returns true.
     *
     * @param s the string to check
     * @return true if s is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    /**
     * Returns a new string where all uppercase letters in the input string are converted to lowercase,
     * and all lowercase letters are converted to uppercase. Non-alphabetic characters are unchanged.
     * Example: swapCase("Hello, World!") returns "hELLO, wORLD"
     * 
     * @param s the string to swap case
     * @return a new string with swapped case
     */
    public static String swapCase(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

     * Converts the given string to title case (first letter of each word capitalized, the rest lowercase).
     * Example: toTitleCase("hello world") returns "Hello World".
     *
     * @param s the string to convert
     * @return the title-cased version of s
     */
    public static String toTitleCase(String s){
        String[] words = s.split(" ");
        StringBuilder titleCased = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                titleCased.append(Character.toUpperCase(word.charAt(0)))
                          .append(word.substring(1).toLowerCase())
                          .append(" ");
            }
        }
        return titleCased.toString().trim();
    }
    // Your assigned method goes below this line.
    // Follow the same format: Javadoc comment, then the method.
    // this method counts the number of words in a string, where words are separated by the space character. It returns o if there isn't words.
    public static int countWords(String s){
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        String[] words = s.trim().split("\\s+");
        return words.length;
        
    }
    /**
     * Counts the number of occurrences of a given character in a string.
     *
     * @param s the string to search
     * @param c the character to count
     * @return the number of times c appears in s
     */
    public static int countOccurrences(String s, char c) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the count of vowels in the given string.
     * Counts both uppercase and lowercase vowels.
     *
     * @param s the string to count vowels in
     * @return the number of vowels in s
     */
    public static int countVowels(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }


    /**
     * Returns the initials of the given string.
     * Example: initials("John Doe") returns "JD".
     *
     * @param s the string to check
     * @return the initials of s
     */
    public static String initials(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return result.toString();
    }

}
