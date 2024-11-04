class Solution {
    public int[][] solution(int[][] arr) {
                
        // if(arr.length > arr[0].length){
        //     int[][] answer = new int[arr.length][arr.length];
        //     for(int i=0; i<arr.length; i++){
        //         for(int j=0; j<arr[0].length; j++){
        //             answer[i][j] = arr[i][j];                    
        //         }
        //     }
        //     return answer;
        // }else if(arr.length < arr[0].length){
        //     int[][] answer = new int[arr[0].length][arr[0].length];
        //     for(int i=0; i<arr.length; i++){
        //         answer[i] = arr[i];
        //     }
        //     return answer;
        // }else return arr; 
        
        if(arr.length == arr[0].length) return arr;
        
        int max = Math.max(arr.length, arr[0].length);
        int[][] result = new int[max][max];
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                result[i][j] = arr[i][j];
            }
        }
        return result;
    }
}