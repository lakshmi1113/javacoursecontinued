import java.util.Scanner;
public class NumberAdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phone number");
        String s = sc.nextLine();
        int x = Integer.parseInt(s);
        int sum=0;
        int digit = 0;
        while(x>0){
            digit = x%10;
            sum = sum+digit;
            x = (int)Math.floor(x / 10);
        } 
        System.out.println("the sum of digits is "+sum);
    }
}