import java.util.*;
// Approach - 01 (Brute Force)
class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i] == nums[j])
                return true;
            }
        }
        return false;
    }
}

// Approach - 02 (Using HashSet)

class Solution2 {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<Integer>();
      for(int num: nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
      }
      return false;
    }
}