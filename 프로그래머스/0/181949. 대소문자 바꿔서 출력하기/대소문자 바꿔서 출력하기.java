import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
//         String answer = "";
        
//         for(int i=0; i<a.length(); i++){
//             char c = a.charAt(i);
//             if(Character.isLowerCase(c)){
//                 answer += Character.toUpperCase(c);
//             }else{
//                 answer += Character.toLowerCase(c);
//             }
//         }
    
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if(Character.isLowerCase(c)){
                answer.append(Character.toUpperCase(c));
            }else{
                answer.append(Character.toLowerCase(c));
            }
        }
        // println에 전달하면 자동으로 StringBuilder을 String으로 변환해주지만, 명시적으로 작성한 것 
        System.out.println(answer.toString());
    }
}