//3074. Apple Redistribution into Boxes
//weekly contest 388
class Solution {
     public int minimumBoxes(int[] apple, int[] capacity) {
         Arrays.sort(capacity);
         int total = 0;
         for(int i = 0; i<apple.length; i++){
             total += apple[i];
         }
         
         int level = 0;
         for(int i = capacity.length-1; i>=0 && total>0; i--){
             total -= capacity[i];
             level++;
         }
         
         return level;
    }
}
