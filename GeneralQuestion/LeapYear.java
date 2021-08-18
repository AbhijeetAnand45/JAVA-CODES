import java.util.Scanner;

public class LeapYear {
    static void Checkyear(int n){
        if(((n%4 == 0) && (n%100 != 0)) || (n%400 == 0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a year to check if it is leap year : ");
        int n = scan.nextInt();
        Checkyear(n);
        scan.close();
    }
    
}
