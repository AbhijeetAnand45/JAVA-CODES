import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the No. of row you would like to print: ");
        int r = scan.nextInt();
        int i,j;
        for(i=0;i<r;i++){
            for(j=r-i;j>1;j--){
                System.out.print(" ");

            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
    
}
