//3090. Maximum Length Substring With Two Occurrences
//weekly contest 390

class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);
            //System.out.println(charCount.getOrDefault(rightChar, 0));
         
            while (charCount.get(rightChar) > 2) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
                System.out.println(right+ " :" + left);
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }
}
