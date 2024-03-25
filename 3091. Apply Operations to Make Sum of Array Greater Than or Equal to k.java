//3091. Apply Operations to Make Sum of Array Greater Than or Equal to k
//weekly contest 390

class Solution {
    public int minOperations(int k) {
        
        if (k == 1) return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= k / 2; i++) {
            int temp = (int) Math.ceil((double) k / i);
            int m = (i - 1) + (temp - 1);
            ans = Math.min(m, ans);
        }
        return ans;
    }
}
