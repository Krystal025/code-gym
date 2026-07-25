class Solution {
    
    int count = 0;
    
    public int solution(int[] numbers, int target) {
        // 0번째 숫자부터 시작, 합은 0으로 시작
        backtrack(numbers, target, 0, 0);
        
        return count;
        
    }
    
    // idx : 현재까지 처리한 숫자, sum : 현재까지 +/-를 적용해서 나온 값
    void backtrack(int[] numbers, int target, int idx, int sum){
        // 종료조건
        if (idx == numbers.length) {
            if (sum == target) count++;
            return;
        }
        // 케이스 1: index번째 숫자를 +로 사용
        backtrack(numbers, target, idx + 1, sum + numbers[idx]);
        // 케이스 2: index번째 숫자를 -로 사용
        backtrack(numbers, target, idx + 1, sum - numbers[idx]);      
    }
}