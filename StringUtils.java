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
    /**
     * Truncates the given string to the specified maximum length, adding "..." if it was truncated.
     * Example: truncate("Hello, world!", 5) returns "Hello...".
     *
     * @param s the string to truncate
     * @param max the maximum length of the truncated string (not including the "...")
     * @return the truncated string if it exceeds max length, otherwise returns s unchanged
     */
    public static String truncate(String s, int max) {
        if (s.length() <= max) {
            return s;
        } else {
            return s.substring(0, max) + "...";
        }
    }
    // Follow the same format: Javadoc comment, then the method.
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

}
