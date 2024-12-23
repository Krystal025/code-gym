import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Long> arr = new ArrayList<>();
        
        while(n > 0){
            arr.add(n%10);
            n /= 10;
        }
        
        return arr.stream().mapToInt(Long::intValue).toArray();
    }
}