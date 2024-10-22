class Solution {
    public int solution(int[] array, int n) {
        
        int diff = 0, idx = 0;
        int minDiff = Math.abs(array[0] - n);
        
        for(int i=1; i<array.length; i++){
            diff = Math.abs(array[i] - n);
            if(minDiff > diff){
                minDiff = diff;
                idx = i; 
            }else if(minDiff == diff){
                idx = array[i]<array[idx] ? i : idx;
            }
        }
        return array[idx];
    }
}