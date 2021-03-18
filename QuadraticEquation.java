import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Please Enter the coefficient a,b,c of quadratic equation (ax^2 + bx + c) where a is not zero.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        double a = sc.nextInt();
        if(a == 0){
            System.out.println("Value of a can't be zero");
        }
        else{
            System.out.println("Enter value of b: ");
            double b = sc.nextInt();
            System.out.println("Enter value of c: ");
            double c = sc.nextInt();
            double z = b*b - 4*a*c;
            CheckingEquation obj = new CheckingEquation();
            if(z == 0){
                System.out.println(" Equation has real and equal roots");
                obj.check(a, b, c);
                obj.showValue();

            }
            else if(z > 0){
                System.out.println("Equation has two real and different roots");
                obj.check(a, b, c);
                obj.showValue();
            }
            else{
                System.out.println("Equation hasn't any real root");
            }
            
        }
        sc.close();
    }
}
class CheckingEquation {
    double a;
    double b;
    double c;
    double s1;
    double s2;  // s1 and s2 are the variable for solution 1 and solution 2
    void check(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        double z = Math.pow(b*b-4*a*c, 0.5);
        s1 = (-b-z)/(2*a);
        s2 = (-b+z)/(2*a);
        
    }
    void showValue(){
        System.out.println(s1);
        System.out.println(s2);
    }
}
