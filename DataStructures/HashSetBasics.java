package DataStructures;

import java.util.HashSet;

public class HashSetBasics {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add numbers, including duplicates
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(10);

        System.out.println("HashSet: " + set);

        // Check whether a number exists
        System.out.println("Contains 20? " + set.contains(20));

        // Remove a number
        set.remove(30);
        System.out.println("After removing 30: " + set);

        // Number of unique elements
        System.out.println("Number of unique elements: " + set.size());

        // Check whether an array contains duplicates
        int[] arr = {1, 2, 3, 4, 2};

        HashSet<Integer> numbers = new HashSet<>();

        boolean hasDuplicate = false;

        for (int x : arr) {

            if (numbers.contains(x)) {
                hasDuplicate = true;
                break;
            }

            numbers.add(x);
        }

        System.out.println("Array contains duplicates? " + hasDuplicate);

        // Intersection of two arrays
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> first = new HashSet<>();

        // Add elements of first array
        for (int x : arr1) {
            first.add(x);
        }

        HashSet<Integer> intersection = new HashSet<>();

        // Check common elements
        for (int x : arr2) {

            if (first.contains(x)) {
                intersection.add(x);
            }
        }

        System.out.println("Intersection: " + intersection);

        // Clear the set
        set.clear();

        System.out.println("After clear: " + set);

        // Check whether set is empty
        System.out.println("Is set empty? " + set.isEmpty());
    }
}