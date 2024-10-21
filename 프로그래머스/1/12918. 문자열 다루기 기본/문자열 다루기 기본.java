class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()!=4 && s.length()!=6) return false;
        
        char[] charArr = s.toCharArray();
        for(char c : charArr){
            if(!Character.isDigit(c)) return false;
        }
        
        return answer;
    }
}