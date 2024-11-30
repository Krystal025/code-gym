class Solution {
    public int solution(String A, String B) {
        int count = 0;

        for(int i=0; i<A.length(); i++){
            if(A.equals(B)){
                return count;
            }else{
                B = B.substring(1) + B.charAt(0);
                count++;
            }
        }
        return -1;
    }
}