import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>(Arrays.stream(num_list)
                                             .boxed()
                                             .collect(Collectors.toList()));
        switch(n){
            case 1:
                list = list.subList(0, slicer[1]+1); break;
            case 2:
                list = list.subList(slicer[0], list.size()); break;
            case 3:
                list = list.subList(slicer[0], slicer[1]+1); break;
            case 4:
                list.clear();
                for(int j=slicer[0]; j<=slicer[1]; j+=2){
                    list.add(num_list[j]);
                }
                break;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}