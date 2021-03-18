import java.util.Scanner;


public class Fibonacci {
    static int n1=0,n2=1,n3=0;
    static void fibo(int n){
        if(n>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            fibo(n-1);
            
        }
    }
    public static void main(String[] args) {
        System.out.println("Please Enter the no. of terms you want in the series: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("fibonacci series is: "); 
        System.out.println(n1 + " "+ n2);
        fibo(n-2);
        
    }
    
}
