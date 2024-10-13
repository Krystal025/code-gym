import java.lang.StringBuilder;

class Solution {
    public String solution(int age) {
        StringBuilder ageStr = new StringBuilder();
        
        String alphabet = "abcdefghij";
        
        while(age>0){
            ageStr.append(alphabet.charAt(age%10));
            age /= 10;
        }
        
        return ageStr.reverse().toString();
    }
}