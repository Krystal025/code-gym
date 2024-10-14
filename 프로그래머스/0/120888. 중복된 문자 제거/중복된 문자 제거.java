import java.util.*;
import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string) {
        // LinkedHashSet<Character> set = new LinkedHashSet();
        // for(char c : my_string.toCharArray()){
        //     set.add(c);
        // }
        // StringBuilder str = new StringBuilder();
        // for(char c : set){
        //     str.append(c);
        // }
        // return str.toString();
        
        String[] strArr = my_string.split("");
        
        Set<String> set = new LinkedHashSet(Arrays.asList(strArr));
        
        return String.join("", set);
    }
}