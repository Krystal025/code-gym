import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> nameList = new ArrayList<>();
        
        for(int i=0; i<names.length; i++){
            if(i == 0){
                nameList.add(names[0]);
            }else if(i%5 == 0){
                nameList.add(names[i]);
            }
        }
        
        return nameList.toArray(new String[0]);
    }
}