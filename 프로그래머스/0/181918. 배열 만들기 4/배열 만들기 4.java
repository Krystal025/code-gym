import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {        
        ArrayList<Integer> stk = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(stk.size() == 0){
                stk.add(arr[i]);
                continue;
            }else if(stk.get(stk.size()-1) < arr[i]){
                stk.add(arr[i]);
                continue;
            }else if(stk.get(stk.size()-1) >= arr[i]){
                stk.remove(stk.size()-1);
                i--;
            }      
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}