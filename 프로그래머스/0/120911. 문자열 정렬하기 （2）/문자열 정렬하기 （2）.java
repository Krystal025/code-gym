import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        String str = my_string.toLowerCase();
        
        char[] charArray = str.toCharArray();
        
        Arrays.sort(charArray);
        
        return new String(charArray);
    }
}