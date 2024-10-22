class Solution {
    public int solution(int n) {
    
        int num = 1, total = 1;
        
        while(total <= n){
            total *= num + 1;
            if(total<=n) num++;
        }
        return num;
    }
}