import java.util.Scanner;
// You have to print the Below pattern
// * * * * * * 
//   * * * * * 
//     * * * * 
//       * * * 
//         * * 
//           *
public class Pattern_triangleup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the nO. of Rows in the pattern: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        sc.close();
    }
    
}
