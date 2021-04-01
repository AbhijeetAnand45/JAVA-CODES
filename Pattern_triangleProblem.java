import java.util.Scanner;
// you have to print this pattern :
//         * 
//       * *
//     * * *
//   * * * *
// * * * * *

public class Pattern_triangleProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the nO. of Rows in the pattern: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=n-i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
