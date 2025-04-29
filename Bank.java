import java.util.Scanner;
public class Bank {
    static String bankname;
    static String accholdername;
    static int accountno;
    static int balance;
    int wdlamount;
    int dptamount;
    static int counter =100000;
    public static int setaccno(){
        counter++;
        return counter;
    }
    public Bank(String accholdername){
        this.accholdername = accholdername;
        this.accountno = setaccno();
        this.balance =0;
    }
    public static int deposit(int amt){
        if (amt<0){
            System.out.println("Please enter a positive amount");
        }
        else if(amt ==0){
            System.out.println("No money has been deposited");
        }
        else{
            balance +=amt; 
        }
        return balance;
    }
    
    public static int withdraw(int amt) {
        if( amt > balance){
            System.out.println("You do not have sufficient balance");
        }
        else if (amt < 0) {
            System.out.println("Please enter a positive amount");
        } else if (amt == 0) {
            System.out.println("No money has been withdrawn");
        } else {
            balance -= amt;
        }
        return balance;
    }
    public static void accinfo(){
        System.out.println("A/C holder name: " + accholdername);
        System.out.println("A/C type: Savings A/C");
        System.out.println("A/C no.: " + accountno);
        System.out.println("A/C Balance: "+ balance);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank("lakshmi");
        boolean run = true;
        while (run){
        System.out.println("Enter which function to perform:- \n 1.Deposit \n 2.Withdraw \n 3.View A/C info \n 4.Quit");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("Enter amount to be deposited: ");
            int amt = sc.nextInt();
            deposit(amt);
            break;
            case 2:
            System.out.println("Enter amount to be withdrawn: ");
            int wamt = sc.nextInt();
            withdraw(wamt);
            break;
            case 3:
            accinfo();
            break;
            case 4:
            run = false;
            break;
            default:
            System.out.println("Invalid option entered.");
        }
        }
    }
}