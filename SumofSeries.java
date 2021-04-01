import java.util.Scanner;
// You have to print the sum of series 1-1/2 + 1/3 - 1/4 + ...+ 1/n
public class SumofSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float sum =0;
        
        for(float i=1;i<=n;i++){
            if(i%2 == 0){
                sum = sum - 1/i;
            }
            else{
                sum = sum +  1/i;
            }
        }
        System.out.println("summation is :"+ sum);
        
        scan.close();
    }
}
