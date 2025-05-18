/*
Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()
*/

package strings;

public class NumericCheck {
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "123456";
        if (isNumeric(input)) {
            System.out.println("The string is numeric.");
        } else {
            System.out.println("The string is not numeric.");
        }
    }
}
