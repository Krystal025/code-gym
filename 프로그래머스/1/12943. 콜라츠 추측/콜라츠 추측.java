class Solution {
    public int solution(int num) {
        int count = 0;
        // long 타입으로 변경하여 큰 수를 처리 (오버플로우 발생 예방)
        long number = num;  
        
        while(number != 1){
            if(count >= 500){
                return -1;
            }
            number = (number%2 == 0) ? number/2 : number*3+1;
            count++;
        }
            
        return count;
    }
}