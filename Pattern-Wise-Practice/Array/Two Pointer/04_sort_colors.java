import java.util.*;

// Leetcode 75

//Approach 1: Counting approach
class Solution {
    public void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for(int num:nums){
            if(num == 0){
                countZero++;
            }else if(num == 1){
                countOne++;
            }else{
                countTwo++;
            }
        }

        int index = 0;
        while(countZero > 0){
            nums[index++] = 0;
            countZero--;
        }
        while(countOne > 0){
            nums[index++] = 1;
            countOne--;
        }
        while(countTwo > 0){
            nums[index++] = 2;
            countTwo--;
        }
    }
}


//Approach 2 : Dutch National Flag Algorithm
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                int t = nums[mid];
                nums[mid] = nums[low];
                nums[low] = t;
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int p = nums[high];
                nums[high] = nums[mid];
                nums[mid] = p;
                high--;
            }
        }
    }
}