import java.util.ArrayList;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        // int answer = 0;
        // ArrayList<Integer> index = new ArrayList<>();
        // for(int i=0; i<included.length; i++){
        //     if(included[i] == true){
        //         index.add(i);
        //     }
        // }
        // for(int i=0; i<index.size(); i++){
        //     answer += a + (d*index.get(i));
        // }
        // return answer;
        int answer = 0;
        for(int i=0; i<included.length; i++){
            if(included[i]){
                answer += a + (d*i);
            }
        }
        return answer;
    }
}