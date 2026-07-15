import java.util.*;

// move Zeros
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0 ){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
    }
}


class Solution1 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}

// Two Sum
class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int t = target-nums[i];
            if(map.containsKey(t)){
                return new int[]{i,map.get(t)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}

// two Sum -II sorted array
class Solution4 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length-1;

        while(l<r){
            int left = numbers[l], right = numbers[r];
            int sum = left+right;
            if(sum == target){
                return new int[]{l+1, r+1};
            }else if(sum>target){
                r--;
            }else{
                l++;
            }
        }
        return new int[]{};
    }
}