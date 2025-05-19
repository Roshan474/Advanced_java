/*
Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()
*/

package swing;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("1. String 1: " + str1);
        System.out.println("   String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("2. Length of str1: " + str1.length());
        System.out.println("   Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("3. str1 equals str3? " + str1.equals(str3));
        System.out.println("   str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String sentence = "Java programming is fun";
        System.out.println("4. Does sentence contain 'programming'? " + sentence.contains("programming"));
        System.out.println("   Index of 'fun': " + sentence.indexOf("fun"));

        // 5. Substring Operations
        System.out.println("5. Substring (index 5 to 16): " + sentence.substring(5, 16));

        // 6. String Modification
        String modified = sentence.replace("fun", "awesome");
        System.out.println("6. Modified String: " + modified);

        // 7. Whitespace Handling
        String messy = "   Clean me!   ";
        System.out.println("7. Before trim: '" + messy + "'");
        System.out.println("   After trim: '" + messy.trim() + "'");

        // 8. String Concatenation
        String combined = str1 + " " + str2;
        System.out.println("8. Concatenated String: " + combined);

        // 9. String Splitting
        String csv = "Red,Green,Blue";
        String[] colors = csv.split(",");
        System.out.println("9. Splitting 'Red,Green,Blue':");
        for (String color : colors) {
            System.out.println("   " + color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" Middle").append(" End");
        System.out.println("10. StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Roshan";
        int age = 21;
        String formatted = String.format("11. Name: %s, Age: %d", name, age);
        System.out.println(formatted);

        // 12. Validate Email
        String email = "example@gmail.com";
        System.out.println("12. Email: " + email);
        System.out.println("    Contains '@'? " + email.contains("@"));
        System.out.println("    Starts with 'example'? " + email.startsWith("example"));
        System.out.println("    Ends with '.com'? " + email.endsWith(".com"));
    }
}
