/*
Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()
*/

package strings;

public class RemoveWhitespace {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = " He llo   Wo rld ";
        System.out.println("Without whitespace: " + removeWhitespace(input));
    }
}
