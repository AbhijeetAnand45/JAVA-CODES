import java.util.Scanner;
// You have to print a n*n square having * Below :-
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

public class Pattern_nbyn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the size of square having star.");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
    
}
