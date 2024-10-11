class Solution {
    public int solution(int n) {

        int answer = 1;
        
        while(n%answer != 1){
            answer++;
        }
        // for(int i=1; i<n; i++){
        //     if(n%i == 1){
        //         answer = i;
        //         break;
        //     }
        // }
        return answer;
    }
}