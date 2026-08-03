import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String[] arr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (a, b) -> (b+a).compareTo(a+b));
        if(arr[0].startsWith("0")) return "0";
        
//         StringBuilder sb = new StringBuilder();
        
//         for(String str : arr){
//             sb.append(str);
//         }
//         return sb.toString();
        
        // StringBuilder 사용 또는 join() 사용
        return String.join("", arr); 
    }
}