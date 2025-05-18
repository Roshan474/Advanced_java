/*
Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()
*/
package strings;

public class TruncateString {
    public static String truncate(String str, int maxLength) {
        if (str.length() <= maxLength) return str;
        return str.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {
        String input = "This is a long sentence.";
        System.out.println("Truncated: " + truncate(input, 10));
    }
}
