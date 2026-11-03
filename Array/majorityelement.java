
class Solution {
    public int majorityElement(int[] nums) {

        // Approach: Brute Force (Nested Loops)
        // Problem: Find the element appearing more than n/2 times.
        //leetcode:https://leetcode.com/problems/majority-element/submissions/2188563888/
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)

        int count;
        int majority = 0;
        int majorityele = nums[0];
        for (int i = 0; i < nums.length; i++) {
             count = 1; 
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (majority < count) {
                majority = count;
                majorityele = nums[i];
            }
        }
        return majorityele;
    }
}




/*import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {

        // Approach: HashMap (Frequency Counting)
        // Problem: Find the element appearing more than n/2 times.
// Time Complexity: O(n) average
// Space Complexity: O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}



class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
// Approach: Boyer-Moore Voting Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
// Approach: Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1) auxiliary space (depending on sorting implementation)
import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length / 2];
    }
}*/


            