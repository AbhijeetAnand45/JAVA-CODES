import java.util.Scanner;

public class PrimeNumber {
    //FUNCTION TO CHECK IF THE GIVEN NUMBER IS PRIME OR NOT.
    static void checkPrime(int n){
        int flag = 0;
        int i;
        for(i=2;i<n/2;i++){
            if(n%i == 0){
                flag = 1;
                break;
            }
        }
        if(n==1){
            System.out.println("Given Number is not prime number.");
        }
        else{
            if(flag == 1){
                System.out.println(n + " is not prime Number.");

            }
            else{
                System.out.println(n + " is a prime Number.");
            }

        }
     }
     // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check if it is prime: ");
        int n = sc.nextInt();
        checkPrime(n);
        sc.close();
    }
    
}
