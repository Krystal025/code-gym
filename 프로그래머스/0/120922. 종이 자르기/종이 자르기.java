class Solution {
    public int solution(int M, int N) {
        int count = Math.min(M, N) - 1;
        
        count += Math.min(M, N) * (Math.max(M, N)-1);
        
        return count;
    }
}