class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        char[] charArr = my_string.toCharArray();
                
        for(char c : charArr){
            if(Character.isUpperCase(c)){
                answer[c-'A']++;
            }else{
                answer[26 + c-'a']++;
            }          
        }
        return answer;
    }
}