package Array;

// LeetCode:
// Problem: Check if Array is Sorted
// Approach:
// Compare every element with the elements after it.
// If any element is greater than a later element, the array is not sorted.
// Count the number of such cases. If count is 0, the array is sorted.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class sortedornot {

    public static void main(String args[]) {

        int[] nums = {2, 4, 7, 6};
        int count = 0;

        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] <= nums[j]) {
                    continue;
                }

                count++;
            }
        }

        if (count == 0) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array not sorted");
        }
    }
}

// LeetCode:
// Problem: Check if Array is Sorted

// Approach:
// Compare each element with the previous element.
// If the current element is smaller than the previous element,
// the array is not sorted.
// Count the number of such cases.
// If count is 0, the array is sorted.

// Time Complexity: O(n)
// Space Complexity: O(1)

/*public class sortedornot {

    public static void main(String args[]) {

        int[] nums = {2, 4, 7, 6};
        int count = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] >= nums[i - 1]) {
                continue;
            }

            count++;
        }

        if (count == 0) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array not sorted");
        }
    }
}/* */