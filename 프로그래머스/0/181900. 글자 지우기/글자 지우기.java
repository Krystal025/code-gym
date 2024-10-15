import java.lang.StringBuilder;
import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        Arrays.sort(indices);
        StringBuilder str = new StringBuilder(my_string);
        
        for(int i=indices.length-1; i>=0; i--){
            str.deleteCharAt(indices[i]);
        }
        
        return str.toString();
    }
}