class Solution {
    public int solution(int[] numbers, int k) {
        int idx = 0;
        
        for(int i=1; i<k; i++){
            if(idx == numbers.length-2){
                idx = 0;
            }else if(idx == numbers.length -1){
                idx = 1;
            }else{
                idx += 2;
            }
        }
        
        return numbers[idx];
    }
}