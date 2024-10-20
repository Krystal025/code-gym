import java.lang.StringBuilder;

class Solution {
    public int solution(int i, int j, int k) {
        
//         StringBuilder str = new StringBuilder();
//         int count = 0;
        
//         for(int num=i; num<=j; num++){
//             str.append(num);
//         }
//         char[] charArr = str.toString().toCharArray();
        
//         for(char c : charArr){
//             if(Character.getNumericValue(c) == k) count++;
//         }
//         return count;
        int count = 0;
        
        for(int num=i; num<=j; num++){
            // num을 직접 나눌 경우 for문에서 증가시키는 num에 영향을 미침 
            int tmp = num; 
            while(tmp > 0){
                if(tmp%10 == k) count++;
                tmp /= 10;
            }
        }
        return count;
    }
}