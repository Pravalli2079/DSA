package Array;

// LeetCode: 
// Problem: Remove Duplicates from Sorted Array
// Approach: Brute Force - When a duplicate is found, shift all elements
//            after it one position to the left and decrease the size.
//
// Time Complexity: O(n²)
// Space Complexity: O(1)

class solution {

    public static int removeDuplicates(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j]) {

                    for (int k = j; k < n - 1; k++) {
                        nums[k] = nums[k + 1];
                    }

                    n--;
                    j--;
                }
            }
        }

        return n;
    }
}

public class removeduplicates {

    public static void main(String[] args) {

        int[] nums = {1, 3, 3, 7, 8};

        int k = solution.removeDuplicates(nums);

        System.out.println("Unique elements: " + k);

        System.out.print("Array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}