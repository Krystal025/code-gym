import java.lang.StringBuilder;

class Solution {
    public String solution(String myString, String pat) {
//         StringBuilder str = new StringBuilder(myString);
        
//         for(int i=myString.length()-1; i>=0; i--){
//             if(!myString.endsWith(pat)){
//                 str.deleteCharAt(i);
//             }
//             myString = str.toString();
//         }
        
//         return myString;
        
        int idx = myString.lastIndexOf(pat);
        
        return myString.substring(0, idx) + pat;
    }
}