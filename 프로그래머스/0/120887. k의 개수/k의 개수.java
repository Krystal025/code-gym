import java.lang.StringBuilder;

class Solution {
    public int solution(int i, int j, int k) {
        
        StringBuilder str = new StringBuilder();
        int count = 0;
        
        for(int num=i; num<=j; num++){
            str.append(num);
        }
        char[] charArr = str.toString().toCharArray();
        
        for(char c : charArr){
            if(Character.getNumericValue(c) == k) count++;
        }
        return count;
    }
}