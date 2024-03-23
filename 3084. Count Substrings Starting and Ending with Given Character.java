//3084. Count Substrings Starting and Ending with Given Character
//weekly contest 389

class Solution {
    public long countSubstrings(String s, char c) {
        long count = 0;
        int n = s.length();
        long charCount = 0; 
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                charCount++;
            }
        }
       
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                count += charCount;
                charCount--; 
            }
        }
        return count;
    }
}
