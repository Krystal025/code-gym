import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
         // 동적 크기 변동이 가능한 새 배열에 기존 배열을 담음 
        for(int num : num_list){
            list.add(num);
        }
        // 배열의 마지막과 마지막에서 두번째인 인덱스를 저장
        int lastIdx = num_list.length - 1;
        int secondLastIdx = num_list.length - 2;
        
        // 두 인덱스의 값을 비교헤서 새 배열에 추가 
        if(num_list[lastIdx] > num_list[secondLastIdx]){
            list.add(num_list[lastIdx] - num_list[secondLastIdx]);
        }else{
            list.add(num_list[lastIdx] * 2);
        }
        // 새 배열을 다시 intp[] 타입으로 변환해서 반환 
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}