class Solution {
    public String solution(String str1, String str2) {
//         String answer = "";
        
//         char[] arr1 = str1.toCharArray();
//         char[] arr2 = str2.toCharArray();
        
//         for(int i=0; i<str1.length(); i++){
//             answer += arr1[i];
//             answer += arr2[i];
//         }
        
//         return answer;
        
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<str1.length(); i++){
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }
        return answer.toString();
    }
}