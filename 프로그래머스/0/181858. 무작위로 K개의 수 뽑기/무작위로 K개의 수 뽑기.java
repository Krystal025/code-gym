import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet();
        int[] answer = new int[k];
        
        for(int element : arr){
            set.add(element);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        
        for(int i=0; i<k; i++){
            answer[i] = list.size()>i ? list.get(i) : -1;
        }
        return answer;
    }
}