class Solution {
    public long solution(long n) {
        
        double x = Math.sqrt(n);
        
        return x == (int)x ? (long)Math.pow(x+1, 2) : -1; 
        
    }
}