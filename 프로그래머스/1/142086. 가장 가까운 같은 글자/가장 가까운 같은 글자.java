class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            // 현재 인덱스보다 앞에 해당 문자가 나왔을 경우 
            if(s.indexOf(s.charAt(i)) < i){
                answer[i] = i - s.lastIndexOf(s.charAt(i), i-1);
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}