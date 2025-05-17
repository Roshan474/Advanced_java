/*
Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
*/

package arraylistLinkedlist;
import java.util.*;

public class Listoperations {

    public static void main(String[] args) {
        // 1. Create ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("----ArrayList Operations----");
        performOperations(arrayList);

        System.out.println("\n----LinkedList Operations----");
        performOperations(linkedList);
    }

    public static void performOperations(List<String> list) {
        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("1. Added Elements: " + list);

        // 2. Adding element at specific index
        list.add(1, "Grapes");
        System.out.println("2. After Adding at Index 1: " + list);

        // 3. Adding multiple elements
        List<String> newFruits = Arrays.asList("Pineapple", "Mango");
        list.addAll(newFruits);
        System.out.println("3. After Adding Multiple Elements: " + list);

        // 4. Accessing elements
        System.out.println("4. Element at Index 2: " + list.get(2));

        // 5. Updating elements
        list.set(3, "Kiwi");
        System.out.println("5. After Updating Index 3: " + list);

        // 6. Removing elements
        list.remove("Banana");
        list.remove(0);  // Remove by index
        System.out.println("6. After Removing Elements: " + list);

        // 7. Searching elements
        boolean hasMango = list.contains("Mango");
        System.out.println("7. Is Mango in the list? " + hasMango);

        // 8. List size
        System.out.println("8. List Size: " + list.size());

        // 9. Iterating over list using for-each
        System.out.print("9. Iterating (for-each): ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("10. Iterating (Iterator): ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("11. After Sorting: " + list);

        // 12. Sublist
        if (list.size() >= 3) {
            List<String> subList = list.subList(1, 3);
            System.out.println("12. Sublist (Index 1 to 2): " + subList);
        }

        // 13. Clearing the list
        list.clear();
        System.out.println("13. After Clearing: " + list);
    }
}
