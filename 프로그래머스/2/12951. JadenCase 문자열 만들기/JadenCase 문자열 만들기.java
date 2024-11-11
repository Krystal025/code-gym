import java.lang.StringBuilder;

class Solution {
    public String solution(String s) {
        
        String[] strArr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].isEmpty()){
                if(Character.isDigit(strArr[i].charAt(0))){
                    sb.append(strArr[i].substring(0, 1));
                }else{
                    sb.append(strArr[i].substring(0, 1).toUpperCase()); 
                }
                sb.append(strArr[i].substring(1).toLowerCase());  
            }
            if(i<strArr.length-1) sb.append(" ");
        }
        return sb.toString();
        
    }
}