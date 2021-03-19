import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter the No of row you would like to print :");
        int n = scan.nextInt();
        int i,j;
        
        for(i=0;i<n;i++){
            for(j=2*(n-i);j>0;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
