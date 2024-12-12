class Solution {
    public int solution(int balls, int share) {
        
        if (balls == share || share == 0) return 1;

        double result = 1; 

        for (int i = 0; i < share; i++) {
            result *= (balls - i);   // 분자 계산
            result /= (i + 1);       // 분모 계산
        }

        return (int) Math.round(result); // 최종적으로 정수로 변환

    }
}