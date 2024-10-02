class Solution {
    public int solution(String my_string, String is_suffix) {
        
        int answer = 0;
                
        int startIdx = my_string.length()-is_suffix.length();
        
        if(startIdx >= 0){
            answer = (my_string.substring(startIdx)).equals(is_suffix) ? 1 : 0;
        }
        
        return answer;
    }
}