class Solution {
    public int solution(int n) {
        // 소수의 개수
        int count = 0;
        // 2이상의 자연수만 소수가 될 수 있음 
        for(int i=2; i<=n; i++){
            boolean isPrime = true;
            // 소수 판별 : 2부터 해당수의 제곱근 까지의 수로 나누어 지지 않는 수 
            for(int j=2; j<=Math.sqrt(i); j++){
                // 나누어 떨어질 경우 소수가 아님
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            // 소수라면 개수를 증가시킴 
            if(isPrime) count++;
        }
        return count;
    }
}