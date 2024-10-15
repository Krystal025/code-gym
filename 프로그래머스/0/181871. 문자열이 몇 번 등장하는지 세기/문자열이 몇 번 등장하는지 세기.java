class Solution {
    public int solution(String myString, String pat) {
        int count = 0;

//         int idx = myString.indexOf(pat);
        
//         while(idx != -1){
//             count++;
//             idx = myString.indexOf(pat, idx+1);
//         }
        
        for(int i=0; i<myString.length(); i++){
            if(myString.substring(i).startsWith(pat)) count++;
        }
        
        return count;
    }
}