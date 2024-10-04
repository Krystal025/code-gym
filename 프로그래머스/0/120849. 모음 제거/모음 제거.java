import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string) {
//         StringBuilder result = new StringBuilder();
        
//         char[] charArr = my_string.toCharArray();
        
//         for(char c : charArr){
//             if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
//                 result.append(c);                
//             }
//         }   
//         return result.toString();
        
        String answer = my_string.replaceAll("[aeiou]", "");
    
        return answer;
    }
}