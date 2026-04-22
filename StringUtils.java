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

    /**
     * Wraps a string to a given line width by inserting newlines every {@code width} characters.
     * Does not split on word boundaries. Example: wrapLine("Hello World", 5) returns "Hello\n Worl\nd\n".
     *
     * @param s     the string to wrap
     * @param width the maximum number of characters per line
     * @return the wrapped string with newlines inserted at every {@code width} characters
     */
    public static String wrapLine(String s, int width) {
        StringBuilder wrapped = new StringBuilder();
        int index = 0;
        while (index < s.length()) {
            wrapped.append(s, index, Math.min(index + width, s.length()));
            wrapped.append("\n");
            index += width;
        }
        return wrapped.toString();
    }
}