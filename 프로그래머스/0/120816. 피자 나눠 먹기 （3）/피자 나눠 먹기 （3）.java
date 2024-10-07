class Solution {
    public int solution(int slice, int n) {
        
        // 정수형으로 나누면 소수점 이하가 계산되지 않음 (적어도 하나는 실수형이어야함)
        return (int) Math.ceil(n/(double)slice);
        
    }
}