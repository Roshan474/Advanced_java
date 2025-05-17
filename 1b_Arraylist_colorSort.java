/*
Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)
*/
package arraylistLinkedlist;

import java.util.*;

public class ColorSort {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Yellow", "Blue", "Red", "Green"));
        System.out.println("Original List: " + colors);

        Collections.sort(colors);
        System.out.println("Sorted List: " + colors);
    }
}
