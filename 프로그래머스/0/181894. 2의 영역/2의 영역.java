import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        
        int s = list.indexOf(2);
        int e = list.lastIndexOf(2);
        
        if(list.contains(2)){
            list = list.subList(s, e+1);
        }else{
            list.clear();
            list.add(-1);
        } 
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}