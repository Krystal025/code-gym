class Solution {
    public int solution(int a, int b) {
        int gcd = 0;
        // 두 수의 최대공약수를 구함
        for(int i=1; i<=Math.min(a, b); i++){
            if(a%i == 0 && b%i == 0) gcd = i;
        }
        // 1보다 큰 최대공약수가 있다면 나눠서 기약분수로 만듦 
        b /= gcd;
        while(b%2 == 0 || b%5 == 0){
            if(b%2 == 0) b /= 2;
            if(b%5 == 0) b /= 5;
        }        
        return b == 1 ? 1 : 2;
        }
}