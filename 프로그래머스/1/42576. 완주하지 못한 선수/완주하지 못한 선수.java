import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> map = new HashMap<>();
        
        // 빈도수 증가
        for(String name : participant){
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        // 빈도수 감소 
        for(String name : completion){
            map.put(name, map.get(name) - 1);
        }
        // 빈도수가 감소되지 않은 이름 찾아 반환
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        
        return "";
    }
}