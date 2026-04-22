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
}
