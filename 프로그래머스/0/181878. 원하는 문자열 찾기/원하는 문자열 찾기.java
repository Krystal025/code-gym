class Solution {
    public int solution(String myString, String pat) {
        
        pat = pat.toLowerCase();
        
        return myString.toLowerCase().contains(pat) ? 1 : 0;
    }
}