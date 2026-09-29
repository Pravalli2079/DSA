package Array;

// LeetCode: 
// Problem: second largest element

// Approach:
// 

// Time Complexity: O(n)
// Space Complexity: O(1)

class secondlargestelement {
     public static void main(String[] args) {
        int[] nums = {8, 8, 4, 3, 2};
        int largest=nums[0];
        int slargest=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                
                slargest=largest;
                largest=nums[i];
            }
            else if(nums[i]<largest&&nums[i]>slargest){
                    slargest=nums[i];
                }
            }
        
        System.out.println("second largest element"+slargest);
        
    }
}