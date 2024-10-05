class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char[] charArr = myString.toCharArray();
        
        for(char c : charArr){
            answer += c < 'l' ? "l" : c;
        }
        return answer;
    }
}