import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Please Enter the no. of rows you would like to print:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
