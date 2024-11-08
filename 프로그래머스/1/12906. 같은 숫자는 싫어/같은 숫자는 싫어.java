import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty() || stack.peekLast() != arr[i]){
                stack.addLast(arr[i]);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}