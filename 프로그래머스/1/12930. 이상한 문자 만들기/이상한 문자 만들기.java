import java.lang.StringBuilder;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append(" ");
                idx = 0;
                continue;
            }else{
                if(idx%2 == 0){
                    sb.append(Character.toString(s.charAt(i)).toUpperCase());
                }else{
                    sb.append(Character.toString(s.charAt(i)).toLowerCase());
                }
                idx++;
            }
        }
        return sb.toString();
    }
}