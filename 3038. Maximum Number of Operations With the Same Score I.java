//3038. Maximum Number of Operations With the Same Score I
//biweekly contest 124

class Solution {
     public int maxOperations(int[] nums) {
       if(nums.length<2) return 0;
        int ans = 1;
         int sumOrigin = nums[0]+nums[1];
         LinkedList<Integer> queue = new LinkedList<>();
         for(int i = 2; i<nums.length; i++)
             queue.add(nums[i]);
         
         while(queue.size()>1){
             int first = queue.peekFirst();
             queue.removeFirst();
             int second = queue.peekFirst();
             queue.removeFirst();
             if(first+second == sumOrigin)
                 ans++;
             else
                 return ans;
         }
         return ans;
             
    }
}
