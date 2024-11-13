import java.util.ArrayList;
import java.lang.StringBuilder;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<picture.length; i++){
            StringBuilder sb = new StringBuilder(); 
             for(int j=0; j<picture[i].length(); j++){
                 sb.append(String.valueOf(picture[i].charAt(j)).repeat(k));
            }
            for(int m=0; m<k; m++) list.add(sb.toString());                
        }
        
        return list.toArray(new String[0]);
    }
}