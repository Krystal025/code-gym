class Solution {
    public int solution(int n) {
//         int answer = 0;
        
//         String num = String.valueOf(n);
        
//         for(int i=0; i<num.length(); i++){
//             answer += Character.getNumericValue(num.charAt(i));
//         }
//         return answer;   
        
        int answer = 0;
        
        while(n>0){
            answer += n%10;
            n/=10;
        }
        return answer;
    }
}