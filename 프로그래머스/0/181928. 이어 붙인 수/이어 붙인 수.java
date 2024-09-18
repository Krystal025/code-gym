class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        // num_list에서 추출한 홀수와 짝수를 문자열로 이어붙이기 위한 변수 선언 
        String strOdd = "";
        String strEven = "";
        
        // 홀수와 짝수를 추출해 이어붙임 
        for(int i : num_list){
            if(i%2 != 0){   
                strOdd += i;
            }else{
                strEven += i;
            }
        }
        
        // 이어붙인 수를 정수로 변환하여 더함 
        answer = Integer.parseInt(strOdd) + Integer.parseInt(strEven);
              
        // 추출한 홀수와 짝수를 더함
        
        return answer;
    }
}