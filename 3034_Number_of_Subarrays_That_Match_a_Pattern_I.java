//3034. Number of Subarrays That Match a Pattern I
//Weekly Contest 384

class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count = 0;
        int n = nums.length;
        int m = pattern.length;
        int diff = n - m + 1;
        for(int i = 0; i < diff; i++){
            if(helper(nums, pattern, i, m))
                count++;
        }
        return count;
    }
    
    public boolean helper(int[] nums, int[] pattern, int index, int m){
        for(int i = 0; i < m; i++){
            if (index + i >= nums.length - 1) 
                return false;
            int difference = nums[index + i + 1] - nums[index + i];
            if (difference < 0 && pattern[i] == 1)
                return false;
            else if (difference > 0 && pattern[i] == -1)
                return false;
            else if (difference != 0 && pattern[i] == 0)
                return false;
            else if (difference == 0 && pattern[i] != 0) 
                return false;
        }
        return true;
    }
}
