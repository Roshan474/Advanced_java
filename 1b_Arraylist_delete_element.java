/*
Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index
*/


package arraylistLinkedlist;

import java.util.*;

public class DeleteNthElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));
        System.out.println("Original List: " + colors);

        int n = 3; // Remove 3rd element (index 2)
        if (n - 1 < colors.size()) {
            colors.remove(n - 1);
            System.out.println("After deleting " + n + "rd element: " + colors);
        } else {
            System.out.println("Invalid index");
        }
    }
}
