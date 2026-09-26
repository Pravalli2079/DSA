package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, Integer> marks = new HashMap<>();

        // Add student names and marks
        marks.put("Ravi", 85);
        marks.put("Anjali", 90);
        marks.put("Kiran", 78);
        marks.put("Sneha", 88);

        System.out.println("Student marks: " + marks);

        // Retrieve a value using a key
        System.out.println("Ravi's marks: " + marks.get("Ravi"));

        // Update a value
        marks.put("Ravi", 95);
        System.out.println("After updating Ravi: " + marks);

        // Remove a key
        marks.remove("Kiran");
        System.out.println("After removing Kiran: " + marks);

        // Check whether a key exists
        System.out.println("Contains Anjali? " + marks.containsKey("Anjali"));

        // Check whether a value exists
        System.out.println("Contains 88? " + marks.containsValue(88));

        // Get size
        System.out.println("Size: " + marks.size());

        // Traverse keys and values using entrySet()
        System.out.println("Student marks:");

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Frequency of numbers in an array
        int[] arr = {1, 2, 2, 3, 1, 2, 4, 3, 3};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        System.out.println("Frequency: " + freq);

        // Clear the map
        marks.clear();

        System.out.println("After clear: " + marks);

        // Check whether map is empty
        System.out.println("Is map empty? " + marks.isEmpty());
    }
}