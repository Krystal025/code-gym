import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String strN = String.valueOf(n);
        
        for(int i=0; i<strN.length(); i++){
            answer += n%10;
            n /= 10;
        }

        return answer;
    }
}