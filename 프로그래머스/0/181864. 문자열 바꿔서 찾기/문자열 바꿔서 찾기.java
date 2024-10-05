import java.lang.StringBuilder;

class Solution {
    public int solution(String myString, String pat) {
        
        StringBuilder str = new StringBuilder();
        char[] charArr = myString.toCharArray();
        
        // 문자열 변경
        for(char c : charArr){
            if(c == 'A'){
                str.append("B");
            }else if(c == 'B'){
                str.append("A");
            }
        }
        
        // 일치하는 부분 문자열이 있는지 확인
        if(str.toString().contains(pat)){
            return 1;
        }else{
            return 0;
        }
    }
}