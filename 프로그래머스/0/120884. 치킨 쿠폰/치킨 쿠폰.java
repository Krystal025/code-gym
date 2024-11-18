class Solution {
    public int solution(int chicken) {
        int service = 0, coupon = 0;

        while(chicken+coupon >= 10){ 
            int totalCoupons = chicken+coupon;
            service += totalCoupons / 10;
            coupon = totalCoupons % 10;
            chicken = totalCoupons / 10;
        }
                
        return service;
    }
}