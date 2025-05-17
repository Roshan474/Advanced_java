/*
Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()
*/


package arraylistLinkedlist;

import java.util.*;

public class ColorSublist {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Original List: " + colors);

        List<String> subList = colors.subList(0, 2); // Extract index 0 and 1
        System.out.println("1st and 2nd Elements: " + subList);
    }
}
