import java.lang.StringBuilder;

class Solution {
    public String solution(int[] food) {
        
        StringBuilder amount = new StringBuilder();
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                // StringBuilder에는 숫자를 넣으면 자동으로 문자열로 변환해줌 
                amount.append(i);
            }
        }
        return amount.toString() + "0" + amount.reverse().toString();
    }
}