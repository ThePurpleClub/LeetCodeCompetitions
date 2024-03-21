//3080. Mark Elements on Array by Performing Queries
//bi-weekly contest 126

class Solution {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {

        HashSet<Integer> ind = new HashSet<>();
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        long sumOfNums= 0 ;
        
        for(int i=0;i<nums.length;i++){
            ind.add(i);
            pq.add(nums[i]);
            sumOfNums+=nums[i];
        }
    
        
        HashMap<Integer,Queue<Integer>> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            if(hash.get(val)==null){
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                hash.put(val,queue);
            }else{
                Queue<Integer>  queue= h.get(val);
                queue.add(i);
            }
        }
        
        long ans[] = new long[queries.length];
        
        for(int i=0;i<queries.length;i++){
            
            int left = queries[i][0];
            int right = queries[i][1];
            
            long sum = 0;
            
            if(ind.contains(left)){
                ind.remove(left);
                sumOfNums-=nums[left];
            }
            
            while(right>0){
                
                if(pq.size()>0){
                    
                    int minval = pq.poll();
                    Queue<Integer> indexes = h.get(minval);
                    int minInd = indexes.remove();
                    
                    if(ind.contains(minInd)){
                        right--;
                        ind.remove(minInd);
                        sumOfNums-=nums[minInd];
                    }else{
                        
                    }
                    
                }else
                    break;
            }
            ans[i] = sumOfNums;
        }
        
        return ans;
        
    }
}
