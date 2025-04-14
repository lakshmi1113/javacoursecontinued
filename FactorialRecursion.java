import java.util.Scanner;

public class FactorialRecursion {

    public static int factorial(int a) {

        if (a >= 1) {

            return a * factorial(a -1);

        }

        else {

            return 1;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        int num = sc.nextInt();

        System.out.println(factorial(num));

    }

}