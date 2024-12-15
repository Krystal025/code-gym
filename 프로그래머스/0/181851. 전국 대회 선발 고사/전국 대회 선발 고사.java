


import java.util.*;

    class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // key를 기준으로 오름차순 정렬하는 TreeMap 사용
        Map<Integer, Integer> map = new TreeMap<>();
        // map에 key-value를 추가 (rank가 높은 순서대로 저장될 수 있도록 rank[i]를 key로 사용)
        for(int i=0; i<rank.length; i++){
            if(attendance[i] == true){
                map.put(rank[i], i);
            }
        }
        // Map은 인덱스로 접근이 불가능하기 때문에 value들을 list에 저장함
        List<Integer> list = new ArrayList<>(map.values());
        // list의 저장된 value들을 인덱스를 사용하여 3개만 가져옴 
        return 10000 * list.get(0) + 100 * list.get(1) + list.get(2);        
    }
}