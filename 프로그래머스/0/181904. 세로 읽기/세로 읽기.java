import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, int m, int c) {
        
        StringBuilder answer = new StringBuilder();
        
        String[] strArr = my_string.split("");
        
        for(int i=c-1; i<strArr.length; i+=m){
            answer.append(strArr[i]);
        }
        
        return answer.toString();
    }
}