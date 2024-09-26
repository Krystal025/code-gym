import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        
        // "x"를 기준으로 문자열 자르기 
        String[] splitArr = myString.split("x");
        
        // 자른 문자열을 저장할 배열 생성 
        ArrayList<String> list = new ArrayList<>();
        
        // "x"가 연속되면 빈문자열이 저장되므로, 빈문자열이 아닐 때만 배열에 추가 
        for(String str : splitArr){
            if(!str.isEmpty()){
                list.add(str);
            }
        }
        
        // String[] 타입으로 반환해야하기 때문에 String[] 배열 생성 
        String[] result = new String[list.size()];
        
        // 배열로 변환
        list.toArray(result);
        
        // 사전순으로 정렬 
        Arrays.sort(result);
        
        return result;
    }
}