//3046. Split the Array
//Weekly Contest 386

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        }
        
        for(Integer k: hash.values()){
            if(k>2)
                return false;
            
        }
        return true;
    }
}
