package Array;
// LeetCode: 
// Problem: 

// Approach:
// 

// Time Complexity: O()
// Space Complexity: O()


public class sortedornot {
    public static void main(String args[]){
        int[] nums={2,4,7,6};
        int count=0;
        for(int i=0;i<=nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]<=nums[j]){
                continue;
            }
            count++;
        }
        }
        if(count==0){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array not sorted");
        }
    }
    
}
