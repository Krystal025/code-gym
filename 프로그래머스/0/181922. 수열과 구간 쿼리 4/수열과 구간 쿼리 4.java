class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i=0; i<queries.length; i++){
            for(int num=queries[i][0]; num<=queries[i][1]; num++){
                if(num%queries[i][2] == 0){
                    arr[num] = arr[num] + 1;
                }
            }
        }
        return arr;
    }
}