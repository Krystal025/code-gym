import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for(int i=n; i>0; i--){
        //     for(int j=0; j<=n-i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
    }
}