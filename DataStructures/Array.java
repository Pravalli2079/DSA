package DataStructures;

import java.util.Arrays;

public class Array {

    // Method that returns an array
    static int[] createArray() {
        int[] arr = {10, 20, 30, 40, 50};
        return arr;
    }

    public static void main(String[] args) {

        // 1. Declaration
        int[] numbers;

        // 2. Initialization
        numbers = new int[5];

        // Assigning values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 3. Indexing
        System.out.println("Element at index 2: " + numbers[2]);

        // 4. Updating
        numbers[2] = 100;

        System.out.println("After updating:");
        System.out.println(Arrays.toString(numbers));

        // 5. Traversal
        System.out.println("Array elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 6. Array methods
        Arrays.sort(numbers);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(numbers));

        // 7. Returning an array from method
        int[] result = createArray();

        System.out.println("Returned array:");
        System.out.println(Arrays.toString(result));
    }
}