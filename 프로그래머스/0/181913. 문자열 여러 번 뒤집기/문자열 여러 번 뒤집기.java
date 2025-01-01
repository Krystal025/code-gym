import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder str = new StringBuilder(my_string);
        
        for(int i=0; i<queries.length; i++){
            String reverseStr = new StringBuilder(str.substring(queries[i][0], queries[i][1]+1)).reverse().toString();
            str.replace(queries[i][0], queries[i][1]+1, reverseStr);
        }
        return str.toString();
    }
}