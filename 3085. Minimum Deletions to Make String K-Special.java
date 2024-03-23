//3085. Minimum Deletions to Make String K-Special
//weekly contest 389

class Solution {
   public int minimumDeletions(String word, int k) {
       HashMap< Character, Integer> hash = new HashMap<>();
       
       for(char c: word.toCharArray()){
           hash.put(c, hash.getOrDefault(c,0)+1);
       }
       
       List<Integer> frequencies = new ArrayList<>(hash.values());
       Collections.sort(frequencies, Collections.reverseOrder());
       int minDeletions = Integer.MAX_VALUE;
        
       for(int i = 0; i< frequencies.size(); i++){
           int target = frequencies.get(i);
           int deletions = 0;
           for(int j = 0; j<frequencies.size(); j++){
               if(frequencies.get(j) > target + k)
                    deletions += frequencies.get(j)  - (target+k);
               else if(frequencies.get(j) < target)
                    deletions += frequencies.get(j) ;
           }
           minDeletions = Math.min(minDeletions , deletions);
           if(minDeletions ==0)
               break;
          
       } return minDeletions == Integer.MAX_VALUE ? 0: minDeletions;
   }
}
