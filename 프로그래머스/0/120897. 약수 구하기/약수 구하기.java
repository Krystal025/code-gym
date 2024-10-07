import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // 1부터 제곱근까지의 수로 나눠서 나머지가 0이 되는지 확인 
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                list.add(i);
                // 약수의 쌍이 같지 않다면 큰 약수 추가 
                if(i != n/i) list.add(n/i);
            }
        }
        // 오름차순 정렬 (컬렉션)
        Collections.sort(list);
       
        return  list.stream().mapToInt(Integer::intValue).toArray();
    }
}