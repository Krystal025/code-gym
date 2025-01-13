import java.util.Arrays;

class Solution{
    public int solution(int []A, int []B){
        int sum = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<B.length/2; i++){
            int temp = B[i];
            B[i] = B[B.length-1-i];
            B[B.length-1-i] = temp;
        }
        for(int i=0; i<A.length; i++){
            sum += A[i]*B[i];
        }
        
        return sum;
    }
}