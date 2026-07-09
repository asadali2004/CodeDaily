import java.util.*;
// Leetcode 15

// HashSet approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i=0; i<n-2; i++){

            if(i>0 && nums[i] == nums[i-1]) continue;

            HashSet<Integer> set = new HashSet<>();

            for(int j = i+1; j<n; j++){
                int target = -nums[i];
                int need = target - nums[j];
                
                if(set.contains(need)){
                        res.add(Arrays.asList(nums[i], need, nums[j]));

                        while(j+1<n && nums[j] == nums[j+1]) j++;
                    }
                    set.add(nums[j]);
                }
            }
        return res;
    }
}


// Two Pointer Approach

class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i=0; i<n-2; i++){

            if(i>0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;
            int j = i+1;
            int k = n-1;

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    res.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                    while(j<k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                }else if(sum > 0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return res;
    }
}