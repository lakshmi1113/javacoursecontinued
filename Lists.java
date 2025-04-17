import java.util.Scanner;
import java.util.*;
public class Lists{
    public static void main(String[] args){
        List <String> lst = new ArrayList<>();
        lst.add("Fourth Wing");
        lst.add("Hunger Games");
        lst.add("Iron Flame");
        lst.add(2, "Red Queen");
        System.out.println(lst);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which operation to perform(1-6):- \n 1.Find size \n 2.Remove an element \n 3.Add an element \n 4.Find the index of an element \n 5. Replace an elemnent \n 6. Fetch an element");
        int op = sc.nextInt();
        if(op == 1){
            System.out.println("no.of elements is:-"+ lst.size());
        }
        else if(op == 2){
        System.out.println("Enter which element to remove");
        int x = sc.nextInt();
        lst.remove(x-1);
        System.out.println("Updated list is:- " + lst);
        }
        else if(op==3){
            System.out.println("Enter which element to add");
            sc.nextLine();
            String x = sc.nextLine();
            System.out.println("Enter at which index to add:-");
            int y = sc.nextInt();
        lst.add(y , x);
        System.out.println("Updated list is:- " + lst);
        }
        else if(op == 4){
            System.out.println("Enter which index to fetch:-");
        int x = sc.nextInt();
        System.out.println("The element at "+x+"th index is "+lst.get(x));
        }
        else if(op == 5){
            System.out.println("Enter element to replace with");
            sc.nextLine();
             String x = sc.nextLine();
            System.out.println("Enter at which index to replace:-");
            int y = sc.nextInt();
        lst.set(y , x);
        System.out.println("Updated list is:- " + lst);
        }
        else if(op ==6){
            lst.clear();
            System.out.println("Succesfully cleared the list."+ lst);
        }
        else{
            System.out.println("choose an integer 1-6");
        }
    }
}