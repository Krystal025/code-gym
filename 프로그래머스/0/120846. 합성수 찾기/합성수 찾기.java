class Solution {
    public int solution(int n) {
        int composite = 0;
        
        // n이하의 합성수를 찾는 반복문
        for(int i=4; i<=n; i++){
            // 해당 수의 약수의 개수
            int divisor = 0;
            // 1부터 해당 수까지의 수로 나눠 약수의 개수를 셈
            for(int j=1; j<=i; j++){
                if(i%j == 0) divisor++;
            }
            // 약수의 개수가 3개 이상이라면 합성수 개수 증가 
            if(divisor >= 3) composite++;
        }
        return composite;
    }
}