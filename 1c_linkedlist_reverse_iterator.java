/*
Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())
*/


package arraylistLinkedlist;

import java.util.*;

public class LinkedListReverseIterate {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));
        System.out.println("Original List: " + colors);

        Iterator<String> reverseIterator = colors.descendingIterator();
        System.out.println("Iterating in reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
