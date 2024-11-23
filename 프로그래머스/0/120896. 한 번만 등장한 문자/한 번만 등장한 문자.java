import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) 
                list.add(Character.toString(entry.getKey()));
        }
        // Collections.sort(list);
        return String.join("", list);
    }
}