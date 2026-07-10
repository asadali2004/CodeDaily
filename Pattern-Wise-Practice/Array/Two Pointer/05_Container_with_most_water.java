// Leetcode - 11 

//Approach - Brute force
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;

        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                int h = Math.min(height[i], height[j]);
                int w = j-i;
                int area = h*w;
                maxArea = Math.max(area, maxArea);
            }
        }

        return maxArea;
    }
}

// Approach - 2 Two Pointer 
class Solution1 {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int left = 0, right = n-1;

        while(left < right){

            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = w * h;
            maxArea = Math.max(area, maxArea); 

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }
}