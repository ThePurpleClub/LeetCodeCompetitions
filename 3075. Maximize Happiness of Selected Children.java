//3075. Maximize Happiness of Selected Children
//weekly contest 388

class Solution {
   public long maximumHappinessSum(int[] happiness, int k) {
        
        Arrays.sort(happiness);
          
        long sum = 0;
        int count = 0;
            
            for(int i = happiness.length-1; i >=0 ; i--){
               if(k>0 && (happiness[i] -count)>0)
                sum += happiness[i] - count;
                k--;
                count++;
            }
        
        return sum;
    }
}
