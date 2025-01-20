class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            if(s.substring(0, i).contains(String.valueOf(s.charAt(i)))){
                answer[i] = i - s.lastIndexOf(s.charAt(i), i-1);
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}