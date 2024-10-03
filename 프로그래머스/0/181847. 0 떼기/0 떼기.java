class Solution {
    public String solution(String n_str) {
        int idx = 0;
        // 0이 아닌 수가 나오는 첫번째 인덱스를 구함
        for(int i=0; i<n_str.length(); i++){
            if(n_str.charAt(i) != '0'){
                idx = i;
                break;
            }
        }
        // 해당 인덱스부터 문자열을 반환 
        return n_str.substring(idx);
    }
}