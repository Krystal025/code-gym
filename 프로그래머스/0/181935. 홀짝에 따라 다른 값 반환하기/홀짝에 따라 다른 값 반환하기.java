class Solution {
    public int solution(int n) {
        int answer = 0;
        // n이 홀수일 경우 
        if(n%2 == 1){
            for(int i=1; i<=n; i++){
                answer += i;
                i++;
            }
        // n이 짝수일 경우 
        }else{
            for(int i=0; i<=n; i++){
                answer += (i*i);
                i++;
            }
        }
        
        return answer;
    }
}