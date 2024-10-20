import java.lang.StringBuilder;

class Solution {
    public String solution(String phone_number) {
        StringBuilder number = new StringBuilder();
        
        for(int i=0; i<phone_number.length()-4; i++){
            number.append("*");
        }
        number.append(phone_number.substring(phone_number.length()-4));
        
        return number.toString();
    }
}