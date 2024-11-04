class Solution {
    public int[][] solution(int[][] arr) {
                
        // 행의 개수 > 열의 개수
        if(arr.length > arr[0].length){
            int[][] answer = new int[arr.length][arr.length];
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    answer[i][j] = arr[i][j];                    
                }
            }
            return answer;
        // 행의 개수 < 열의 개수
        }else if(arr.length < arr[0].length){
            int[][] answer = new int[arr[0].length][arr[0].length];
            for(int i=0; i<arr.length; i++){
                answer[i] = arr[i];
            }
            return answer;
        // 행의 개수 = 열의 개수 
        }else return arr;        
    }
}