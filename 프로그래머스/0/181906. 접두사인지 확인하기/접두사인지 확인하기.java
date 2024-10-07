import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_prefix) {
        
        ArrayList<String> list = new ArrayList<>();
                
        for(int i=0; i<my_string.length(); i++){
            list.add(my_string.substring(0, i));
        }
        
        return list.contains(is_prefix) ? 1 : 0;
    }
}