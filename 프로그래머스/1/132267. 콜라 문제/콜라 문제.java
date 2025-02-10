class Solution {
    public int solution(int a, int b, int n) {
        int result = 0; // 받을 수 있는 총 콜라 개수 
        int get = 0; // 현재 가진 빈병으로 얻을 수 있는 콜라 개수 
        int left = 0; // 빈병 교환 후 남은 콜라 개수 
        while(n >= a){ 
            get = n / a * b; 
            left = n % a; 
            result += get;
            n = get + left;
        }
        return result;
    }
}