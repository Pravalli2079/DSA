package DataStructures;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add five numbers
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original list: " + list);

        // Get an element
        System.out.println("Element at index 2: " + list.get(2));

        // Update an element using set()
        list.set(2, 100);
        System.out.println("After updating: " + list);

        // Remove an element by index
        list.remove(1);
        System.out.println("After removing index 1: " + list);

        // Check whether a value exists
        System.out.println("Contains 40: " + list.contains(40));

        // Find the index of a value
        System.out.println("Index of 40: " + list.indexOf(40));

        // Size of the list
        System.out.println("Size: " + list.size());

        // Print all elements
        System.out.println("All elements:");

        for (int number : list) {
            System.out.println(number);
        }

        // Clear the list
        list.clear();

        System.out.println("After clear: " + list);

        // Check if list is empty
        System.out.println("Is list empty? " + list.isEmpty());
    }
}