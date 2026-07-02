//01 Brute Force Approach()

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if(target == nums[i]+nums[j]){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}

//02  HashMap 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int val = target - nums[i];
            if(map.containsKey(val)){
                return new int[]{map.get(val),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}

