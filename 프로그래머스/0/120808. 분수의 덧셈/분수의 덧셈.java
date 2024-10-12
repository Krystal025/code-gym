class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numerSum = numer1*denom2 + numer2*denom1;  // 분자의 합
        int denomSum = denom1 * denom2;  // 분모의 합
        int max = 1;
        
        for(int i=1; i<=numerSum; i++){
            if(numerSum%i == 0 && denomSum%i == 0){
                max = i;
            }
        }
        
        answer[0] = numerSum/max;
        answer[1] = denomSum/max;
        
        return answer;
    }
}