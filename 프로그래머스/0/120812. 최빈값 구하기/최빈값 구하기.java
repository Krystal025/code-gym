import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<array.length; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        
        int maxKey = 0, maxValue = 0, count = 0;
        
        for(Integer key : map.keySet()){
            Integer value = map.get(key);
            if(maxValue < value){
                maxKey = key;
                maxValue = value;
                count = 1;
            }else if(maxValue == value){
                count++;
            }
        }
        return count > 1 ? -1 : maxKey;
    }
}