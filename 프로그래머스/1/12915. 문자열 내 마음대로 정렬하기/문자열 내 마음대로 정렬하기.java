import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, (a, b) -> {
            char x = a.charAt(n);
            char y = b.charAt(n);
            
            if(x != y) return x - y; // char는 유니코드로 비교 (compareTo 불가능)
            return a.compareTo(b);   // n번째 알파벳이 같은 경우 원본 문자열로 정렬
        });
        
        return strings;
    }
}