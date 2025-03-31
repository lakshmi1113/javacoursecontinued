import java.util.Scanner;
public class RecursionPowers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number x:-");
        int x = sc.nextInt();
        System.out.println("Enter the power n:-");
        int n = sc.nextInt();
         
        int num = power(x,n);
        System.out.println("The number is "+ num);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }

        int xpnb2 = power(x, n/2);
        int xn = xpnb2 *xpnb2;
        
        if(n%2==1){
            xn = xn*x;
        }
        return xn;
    }
}