//3083. Existence of a Substring in a String and Its Reverse
//weekly contest 389
class Solution {
    public boolean isSubstringPresent(String s) {
        for(int i = 0; i< s.length()-1; i++){
            String ss = s.substring(i, i+2);
            StringBuilder sb = new StringBuilder(ss);
            String r = sb.reverse().toString();
            if(s.contains(r))
                return true;
        }
        return false;
       
    }
}
