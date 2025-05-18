/*
Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().
*/

package strings;

public class StringCheck {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String testStr = "   ";
        if (isNullOrEmpty(testStr)) {
            System.out.println("The string is null or empty.");
        } else {
            System.out.println("The string is not null or empty.");
        }
    }
}
