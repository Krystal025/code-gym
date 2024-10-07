import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        
        String[] suffixList = new String[my_string.length()];
        
        // 모든 접미사를 String[]에 저장
        for(int i=0; i<my_string.length(); i++){
            suffixList[i] = my_string.substring(i);
        }
        // 사전순으로 정렬
        Arrays.sort(suffixList);
        
        return suffixList;

    }
}