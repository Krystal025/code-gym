class Solution {
    public int solution(int order) {
        // 쳐야할 박수 횟수 
        int count = 0;
        // 주어진 정수를 문자열로 변환 
        String strNum = String.valueOf(order);
        // 문자열을 char[]형으로 변환하여 하나씩 반복하며 확인 
        for(char c : strNum.toCharArray()){
            // 3.6.9일 경우 박수 횟수 증가 
            if(c=='3' || c=='6' || c=='9') count++;
        }
        return count;
    }
}