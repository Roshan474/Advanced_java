/*
Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList
*/

package arraylistLinkedlist;

import java.util.*;

public class coloremoval {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Original List: " + colors);

        // Remove the 2nd element (index 1)
        colors.remove(1);
        System.out.println("After removing 2nd element: " + colors);

        // Remove color "Blue"
        colors.remove("Blue");
        System.out.println("After removing 'Blue': " + colors);
    }
}
