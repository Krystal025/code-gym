import java.lang.StringBuilder;
import java.util.Arrays;

class Solution {
    public long solution(String numbers) {
        StringBuilder result = new StringBuilder();
        StringBuilder str = new StringBuilder(numbers);
        String[] numArr = {"zero", "one", "two", "three", "four", 
                           "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<10; i++){
            numbers = numbers.replaceAll(numArr[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
        
    }
}