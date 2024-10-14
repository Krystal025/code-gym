import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        StringBuilder str = new StringBuilder(my_string.substring(s, e+1));
        str.reverse();
        answer.append(my_string.substring(0, s));
        answer.append(str);
        answer.append(my_string.substring(e+1));
        
        return answer.toString();
    }
}