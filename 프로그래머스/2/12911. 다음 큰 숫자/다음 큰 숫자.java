class Solution {
    public int solution(int n) {
        int count1 = 0;
        int count2 = 0;
        int num = n+1;
        
        while(n>0){
            if(n%2 == 1) count1++;
            n /= 2;
        }
        while(count1 != count2){
            int temp = num;
            while(temp>0){
                if(temp%2 == 1) count2++;
                temp /= 2;
            }
            if(count1 == count2) return num;
            num++;
            count2 = 0;
        }
        return num;
    }
}