class Solution {
    public int solution(int balls, int share) {
        
        if (balls == share) return 1;

        long result = 1; 

        for (int i=0; i<share; i++) {
            result *= (balls - i);   // 분자 계산
            result /= (i + 1);       // 분모 계산
        }

        return (int)result; 

    }
}