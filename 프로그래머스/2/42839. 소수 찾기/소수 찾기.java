import java.util.*;

class Solution {
    
    // 원본 데이터 (배열로 변형)
    char[] numArr;
    // 현재 사용 여부 체크
    boolean[] used;
    // 만들어진 숫자들을 모아둠 (중복 방지용)
    Set<Integer> numSet = new HashSet<>();
    
    public int solution(String numStr) {
        numArr = numStr.toCharArray();    
        used = new boolean[numStr.length()];
        
        // 빈 문자열부터 시작
        backtrack("");
        
        int count = 0;
        for(int num : numSet){
            // 각 숫자가 소수인지 판별하는 함수 호출 -> 맞으면 count++
            if(isPrime(num)) count++;
        }
        return count;
        
    }
    
    void backtrack(String current){
        /* 조각을 1개 이상 썼다면 (current가 비어있지 않다면),
           지금까지 만든 숫자를 결과에 저장
           순열 문제와 다르게, "끝까지 다 써야만" 저장하는 게 아니라
           "한 글자를 새로 붙일 때마다" 매번 저장해야 함
           (1장짜리 숫자도, 2장짜리 숫자도 각각 다 유효한 결과라서) */
        // 선택 (결과 저장)
        if(!current.equals("")){
            numSet.add(Integer.parseInt(current));
        }
        
        // 모든 후보 탐색
        for(int i=0; i<numArr.length; i++){
            // 가지치기
            if (used[i]) continue;
            // 사용 표시
            used[i] = true;
            backtrack(current + numArr[i]);
            used[i] = false;
        }    
    }
    
    boolean isPrime(int num){
        if (num < 2) return false; // 0, 1은 소수가 아님
        
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;    
        }
        return true;
    }
    
}