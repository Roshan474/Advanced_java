/*
Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))
*/

package arraylistLinkedlist;

import java.util.*;

public class LinkedListSwapElements {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Before swapping: " + colors);

        Collections.swap(colors, 0, 2); // Swap index 0 and 2
        System.out.println("After swapping 1st and 3rd elements: " + colors);
    }
}

