//3079. Find the Sum of Encrypted Integers
//bi-weekly contest 126

class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
    
        for(int i = 0; i< nums.length; i++){
                int x = nums[i];
            int num = helper(x);
            sum += num;
            }
        return sum;
    }
    
  public int helper(int x){
      String s = Integer.toString(x);
      char maxDigit = '0';
      for(char digit: s.toCharArray()){
          maxDigit = (char)Math.max(maxDigit, digit);
      }
      String encrypted = String.valueOf(maxDigit).repeat(s.length());
      return Integer.parseInt(encrypted);
  }
}
