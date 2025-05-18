/*
Write a Java Program for Counting the number of words in a string using user defined function
countWords()
*/


package strings;

public class WordCounter {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String input = "  This is a test string  ";
        System.out.println("Word count: " + countWords(input));
    }
}
