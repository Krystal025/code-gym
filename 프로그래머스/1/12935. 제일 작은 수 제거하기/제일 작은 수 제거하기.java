import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : arr){
            list.add(num);
        }
        
        // min() : Collections 메소드
        int min = Collections.min(list);
        
//         int min = arr[0];
        
//         for(int i=1; i<arr.length; i++){
//             min = Math.min(min, arr[i]);
//         }
        
        // 일반 정수는 remove()가 인덱스로 인식하여 삭제할수 있기 때문에 객체로 변환해야함 
        list.remove(Integer.valueOf(min)); 
        
        if(list.size() == 0) list.add(-1);

        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}