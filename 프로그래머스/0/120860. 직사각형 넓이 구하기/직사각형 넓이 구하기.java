class Solution {
    public int solution(int[][] dots) {
        int x = 0;
        int y = 0;
        for(int i=0; i<4; i++){
            x = dots[0][0] != dots[1][0] ? Math.abs(dots[0][0]-dots[1][0]) : Math.abs(dots[0][0]-dots[2][0]);
            y = dots[0][1] != dots[1][1] ? Math.abs(dots[0][1]-dots[1][1]) : Math.abs(dots[0][1]-dots[2][1]);
        }
        return x * y;
    }
}