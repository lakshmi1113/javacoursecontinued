import java.util.*;
public class LibrarySwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while(running){
        System.out.println("Enter what you would like to do:- \n 1.Borrow a book \n 2. Return a book \n 3.Look at all the types of books available\n Press anything else to Quit.");
        int ch = sc.nextInt();
        String[] books = {"Harry Potter", "Fourth Wing", "Iron Flame", "Hunger Games", "Mockingjay"};
        String[] bksLent = new String[books.length];
        int count =0;
        switch(ch){
            case 1:
                System.out.println("Enter the book you would like to borrow:-");
                sc.nextLine();
                String bk = sc.nextLine();
                if (Arrays.asList(books).contains(bk) && (!Arrays.asList(bksLent).contains(bk))){
                    System.out.println("Book borrowed");
                    bksLent[count] = bk;
                    count++;
                }
                else{
                    System.out.println("Book is currently not present in library");
                }
                break;
            case 2:
                System.out.println("Enter the book to be returned:-");
                sc.nextLine();
                String bkr = sc.nextLine();
                if(Arrays.asList(books).contains(bkr) && (!Arrays.asList(bksLent).contains(bkr))){
                    System.out.println("Book returned");
                    int index = Arrays.binarySearch(books, bkr);
                    bksLent[index] =" ";
                }
                else{
                    System.out.println("This book doesnt belong to this library");
                }
                break;
            case 3:
                System.out.println("The books present in the library are:- ");
                for(int i =0; i<books.length; i++){
                    System.out.println((i+1)+"."+books[i]);
                }
                break;
            default:
                 running = false;
                 break;
        }}
    }
}
