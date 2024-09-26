import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        // 문자열을 제거한 배열 생성 
        String[] arr = my_string.replaceAll("[a-z]", "").split("");
        
        int[] answer = new int[arr.length];
        
        // 정수로 변환
        for(int i=0; i<arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        
        // 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}