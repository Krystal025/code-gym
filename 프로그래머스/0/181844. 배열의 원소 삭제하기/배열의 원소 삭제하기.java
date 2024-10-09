import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int element : delete_list){
            list.remove(Integer.valueOf(element));
        }        

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}