import java.util.Scanner;

public class ArmstrongNumber {
    static void checkarmstrong(int n){
        int temp = n;
        int r;
        int c=0;
        while(n>0){
            r = n%10 ;
            c = c + (r*r*r);
            n= n/10;
        }
        if( c == temp){
            System.out.println(temp + " is a armstrong Number.");
        }
        else{
            System.out.println(temp + " is not Armstrong Number.");
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter any No. to check if it is Armstrong Number: ");
        int n = scan.nextInt();
        checkarmstrong(n);
        scan.close();
    }
}