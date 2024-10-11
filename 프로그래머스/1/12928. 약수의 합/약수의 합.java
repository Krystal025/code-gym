class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=Math.sqrt(n); i++){
            // 해당 수의 제곱근까지의 수로 나누어 떨어지면 약수 
            if(n%i == 0){
                answer += i;
                // 약수의 쌍이 같지 않다면 큰 약수 추가 
                if(i != n/i) answer += n/i;
            }
        }
        return answer;
    }
}