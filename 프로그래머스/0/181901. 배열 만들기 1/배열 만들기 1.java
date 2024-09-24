import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        // List<Integer> list = new ArrayList<>();
        // for(int i=1; i<=n; i++){
        //     if(i%k == 0){
        //         list.add(i);
        //     }
        // }
        // return list.stream().mapToInt(Integer::intValue).toArray();
        
        int count = n/k;
        int[] answer = new int[count];
        for(int i=1; i<=count; i++){
            answer[i-1] = k * i;
        }
        return answer;
    }
}