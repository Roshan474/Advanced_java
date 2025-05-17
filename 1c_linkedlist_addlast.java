/*
Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))
*/


package arraylistLinkedlist;

import java.util.*;

public class LinkedListAddLast {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Original List: " + colors);

        colors.offerLast("Pink");
        System.out.println("After adding 'Pink' at the end: " + colors);
    }
}
