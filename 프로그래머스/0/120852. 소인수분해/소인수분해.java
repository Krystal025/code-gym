import java.util.TreeSet;

class Solution {
    public int[] solution(int n) {
        TreeSet<Integer> set = new TreeSet<>();
        
        // 2부터 해당수의 제곱근까지의 수로 나눔 
        for(int i=2; i<=Math.sqrt(n); i++){
            // n이 i로 나누어 떨어지면 약수 
            while(n%i == 0){
                set.add(i);
                // 
                n /= i;
            }
        }
        // 남은 수가 1보다 크다면 해당수가 소수
        if(n > 1) set.add(n);
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}