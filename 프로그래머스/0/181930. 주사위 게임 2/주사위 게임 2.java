class Solution {
    public int solution(int a, int b, int c) {
        // int sum = a + b + c;
        // int square = a*a + b*b + c*c;
        // int cube = a*a*a + b*b*b + c*c*c;
        // if(a!=b && b!=c && a!=c){
        //     return sum;
        // }else if(a==b && b==c && a==c){
        //     return sum * square * cube ;
        // }else{
        //     return sum * square;
        // } 
        int answer = a + b + c;
        if(a==b && b==c){
            answer = answer * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }else if(a==b || b==c || a==c){
            answer = answer * (a*a + b*b + c*c);
        }
        return answer;
    }
}