import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        // 동적으로 요소를 추가할 배열 생성 
        ArrayList<Integer> list = new ArrayList<>();
        // "x"로 문자열을 구분한 배열 생성 
        String[] splitArr = myString.split("x");
        // 각 문자열의 길이를 배열에 추가 
        for(int i=0; i<splitArr.length; i++){
            list.add(splitArr[i].length());
        }        
        // split()은 끝에 있는 구분자는 포함하지 않으므로 수동으로 처리 
        if(myString.endsWith("x")){
            list.add(0);
        }
        // ArrayList -> Array 로 변환 
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}