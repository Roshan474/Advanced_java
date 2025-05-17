/*
Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
*/

package arraylistLinkedlist;

import java.util.*;

public class LinkedListStartFromSecond {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));
        System.out.println("Original List: " + colors);

        Iterator<String> iterator = colors.listIterator(1); // Start from index 1 (2nd element)
        System.out.println("Iterating from 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
