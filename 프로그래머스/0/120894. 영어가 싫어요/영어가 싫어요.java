import java.lang.StringBuilder;
import java.util.Arrays;

class Solution {
    public long solution(String numbers) {
        StringBuilder result = new StringBuilder();
        StringBuilder str = new StringBuilder(numbers);
        String[] numArr = {"zero", "one", "two", "three", "four", 
                           "five", "six", "seven", "eight", "nine"};
        while(str.length() > 0){
            for(int i=0; i<10; i++){
                if(str.toString().startsWith(numArr[i])){
                    result.append(i);
                    str.delete(0, numArr[i].length());
                }
            }
        }
        return Long.parseLong(result.toString());
        
    }
}