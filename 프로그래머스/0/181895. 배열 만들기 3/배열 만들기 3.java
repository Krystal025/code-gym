import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<=1; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                list.add(arr[j]);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
        
        
        
    }
}