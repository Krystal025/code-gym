import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        
        // 문자로 변환 후 구분자로 나눠 배열로 반환
        String[] strArr = String.valueOf(n).split("");
        // 내림차순 정렬
        Arrays.sort(strArr, Collections.reverseOrder());
        // 문자열로 결합 후 숫자로 변환하여 반환
        return Long.parseLong(String.join("", strArr));        
    }
}