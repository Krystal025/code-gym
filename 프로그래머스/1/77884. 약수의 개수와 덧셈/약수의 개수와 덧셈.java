class Solution {
    public int solution(int left, int right) {
        int total = 0;
        
        for(int num=left; num<=right; num++){
            int div = 0;
            for(int i=1; i<=num; i++){
                if(num%i == 0) div++;
            }
            total = div%2 == 0 ? total+num : total-num;
        }
        return total;
    }
}