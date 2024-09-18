class Solution {
    public int solution(int[] num_list) {
        // 곱은 초기값을 1로 설정 
        int multi = 1;
        int sum = 0;
        // 배열의 모든 요소의 곱과 합을 구함
        for(int i : num_list){
            multi *= i;
            sum += i;
        }
        // 합의 제곱을 구함 
        int squared = sum*sum;
        // 곱과 합의 제곱을 비교
        return multi<squared ? 1 : 0; 
    }
}