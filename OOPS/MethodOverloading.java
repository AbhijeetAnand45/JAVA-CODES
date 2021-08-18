class Multiply{
    static int mul(int a, int b){
        return a*b;
    }
    static double mul(double a, double b){   // METHOD OVERLOADED ( SAME NAME BUT DIFFERENT DATA TYPE)
        return a*b;
    }
    static int mul(int a , int b, int c){  // METHOD OVERLOADED( HAVING SAME NAME BUT DIFFERENT NO. OF ARGUMENTS)
        return a*b*c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("\nMultiplication method called with two parameters : "+ Multiply.mul(2,2));
        System.out.println("\nMultiplication method called with three parameters : "+ Multiply.mul(3.0,4.2));
        System.out.println("\nMultiplication method called with three parameters : "+ Multiply.mul(3,4,5));
    }

}