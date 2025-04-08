import java.util.Scanner;
public class StringFunction {
    static void strRev(String s) {
        int n = s.length();
        String s1 = "";
        for (int i = 0; i < n; i++) {
            s1 = s.charAt(i) + s1;
        }
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s + "<--->" + s1);

    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no.of characters:-");
    int n = sc.nextInt();
    System.out.println("Enter the string:-");
    sc.nextLine();
    String s = sc.nextLine();
    strRev(s);
    }
}
