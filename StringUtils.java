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

}
