import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int idx = 0;
        Arrays.sort(d);
        
        while(budget-d[idx] >= 0){
            budget -= d[idx];
            idx++;
            if(idx == d.length) break;
        }
        return idx;
    }
}