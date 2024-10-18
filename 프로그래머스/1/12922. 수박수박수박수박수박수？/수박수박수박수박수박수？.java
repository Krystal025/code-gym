import java.lang.StringBuilder;

class Solution {
    public String solution(int n) {
        StringBuilder str = new StringBuilder();
        
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                str.append("수");
            }else{
                str.append("박");
            }
        }
        return str.toString();
    }
}