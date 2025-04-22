import java.util.*;
class Q{
       
}
public class Queues {
    public static int front = -1;
    public static int rear = -1;
    public static int n = 10;
    public static int[] arr = { 10, 15, 20, 25, 30, 35, 30, 45, 50, 55 };

    public static void enqueue(int item) {
        if (rear == n - 1) {
            System.out.print("overflow");
            System.out.println(" ");
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear += 1;
            }
            arr[rear] = item;
            System.out.println("Element inserted");
        }
    }

        public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        boolean condition = true;
        while(condition){
            System.out.println("1. add an element \n Enter 5 to exit");
            int c = sc.nextInt();
            if (c == 1){
                System.out.println("enter the item");
                int x = sc.nextInt();
                enqueue(x);
            }
            else if(c == 5){
        
                System.out.println("Exited");
            }
            else{
                System.out.println("Invalid");
            }
            condition = (c!=5);
        }
    }
}
