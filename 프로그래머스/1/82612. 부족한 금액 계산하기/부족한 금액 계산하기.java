class Solution {
    public long solution(int price, int money, int count) {
        
        long total = 0;
        
        for(int i=0; i<count; i++){
            total += price * (1 + i);
        }
        
        return money < total ? total-money : 0;

    }
}