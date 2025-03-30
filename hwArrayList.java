import java.util.ArrayList;
import java.util.Scanner;

class function {
    void method1(ArrayList<Integer> a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index p:-");
        int p = sc.nextInt();
        System.out.println("Enter the value to be added:-");
        int r = sc.nextInt();
        a.add(p, r);
        sc.close();
    }

    void method2(ArrayList<Integer> a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be found:-");
        int p = sc.nextInt();
        if (a.contains(p) == true){
            System.out.println("It is at index" + a.lastIndexOf(p));
        } else {
            System.out.println("The element not found");
        }
        sc.close();
    }
}

public class hwArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a =  new ArrayList();
        
        System.out.println("Enter the no.of elements for the list:-");
        int n = sc.nextInt();
        
        System.out.println("Enter elements of the arraylist:-");
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        function obj = new function();
        System.out.println(a);
        System.out.println("Enter which query- \n-1 \n-2");
        int Q = sc.nextInt();
        if (Q == 1) {
            obj.method1(a);
            System.out.println(a);

        }
        if (Q == 2) {
            obj.method2(a);
            System.out.println(a);
        }
        sc.close();
    }
}
