import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays
                                                  .stream(emergency)
                                                  .boxed()
                                                  .collect(Collectors.toList()));
        
        Collections.sort(list, Collections.reverseOrder());
        
        int[] answer = new int[emergency.length];
        
        for(int i=0; i<emergency.length; i++){
            answer[i] = list.indexOf(emergency[i])+1;
        }
        return answer;
    }
}