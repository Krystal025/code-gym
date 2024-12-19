class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        // 최대공약수 
        for(int i=1; i<=min; i++){
            if(n%i == 0 && m%i == 0){
                answer[0] = i;
            }
        }
        // 최소공배수
        if(max%min == 0){
            answer[1] = max;
        }else{
            for(int i=2; i<=1000000; i++){
                if((max*i)%min == 0){
                    answer[1] = max*i;
                    break;
                }
            }
        } 
        return answer;
    }
}