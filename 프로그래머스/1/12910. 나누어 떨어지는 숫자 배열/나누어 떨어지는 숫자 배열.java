import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList();
        
        for(int element : arr){
            if(element%divisor == 0) list.add(element);
        }
        Collections.sort(list);
        
        if(list.isEmpty()) list.add(-1);

        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}