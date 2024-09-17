class Solution {
    public int solution(int a, int b) {
//         int answer = 0;   

//         String strA = Integer.toString(a);
//         String strB = Integer.toString(b);

//         String ab = strA+strB;
//         String ba = strB+strA;

//         int result1 = Integer.parseInt(ab);
//         int result2 = Integer.parseInt(ba);

//         if(result1 > result2){
//             answer = result1;
//         }else{
//             answer = result2;
//         }
//         return answer;
        
        int answer = 0;
        
        int num1 = Integer.parseInt(""+a+b);
        int num2 = Integer.parseInt(""+b+a);
        answer = num1 > num2 ? num1 : num2;
        
        return answer;

    }
}