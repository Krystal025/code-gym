class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // valueOf() : 다른 타입의 값을 문자열로 변환 
        String num = String.valueOf(n);
        
        // getNumericValue() : 문자의 숫자값을 반환
        for(int i=0; i<num.length(); i++){
            answer += Character.getNumericValue(num.charAt(i));
        }
        return answer;   
    }
}