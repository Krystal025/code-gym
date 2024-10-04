import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int[] answer = new int[num2-num1];
        
        // 배열의 크기가 고정되어 있으므로 해당 범위만큼 복사
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        
        return answer;
        
    }
}