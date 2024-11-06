import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        String[] strArr = myStr.split("[abc]");
        
        for(String str : strArr){
            if(!str.isEmpty())list.add(str);
        }
        if(list.size() == 0) list.add("EMPTY");
        return list.toArray(new String[0]);
    }
}