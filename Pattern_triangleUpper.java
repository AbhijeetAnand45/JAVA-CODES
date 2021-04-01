import java.util.Scanner;
// You have to print following pattern: -
// * * * * * 
// * * * *
// * * *
// * *
// *

public class Pattern_triangleUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the nO. of Rows in the pattern: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
