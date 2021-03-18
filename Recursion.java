import java.util.Scanner;

//RECURSIVE PROGRAM TO FIND SUM OF INTEGERS IN A RANGE
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial value: ");
        int a = sc.nextInt();
        System.out.println("Enter the value upto which you would like to calculate the sum: ");
        int b = sc.nextInt();
      int result = sum(a, b);
      System.out.println("The sum of integers from "+a+" to "+ b+" is "+ result);
      sc.close();
    }
    public static int sum(int start, int end) {
      if (end > start) {
        return end + sum(start, end - 1);
      } else {
        return end;
      }
    }
  }
