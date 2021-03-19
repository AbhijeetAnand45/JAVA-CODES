import java.util.Scanner;

public class PelidromeNumber {
    // FUNCTION TO CHECK WHETHER A NUMBER IS A PELIDROME OR NOT.
    static void Checkpelidrome(int n){
        int revN = 0 ;
        int original = n;
        int remainder = 0;
        while(n != 0){
            remainder = n% 10;
            revN = revN * 10 + remainder;
            n = n/10;
        }
        if (original == revN)
        {
            System.out.println(original + " is a pelidrome Number.");
        }
        else{
            System.out.println(original + " is not a pelidrome Number.");
        }
        

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to check whether it is pelidrome or Not: ");
        int n = scan.nextInt();
        Checkpelidrome(n);
        scan.close();
    }
    
}
