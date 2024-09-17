class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        // if(flag == true){
        //     answer = a+b;
        // }else{
        //     answer = a-b;
        // }
        answer = flag==true ? a+b : a-b;
        return answer;
    }
}