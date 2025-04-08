import java.util.Scanner;
public class StringEncryption {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:-");
        String s1 = sc.nextLine();
        String s = s1.toLowerCase();
        int n = s.length();
        String str = "";
        for(int i =0; i<n; i++){
            if(s.charAt(i) == 'a'){
                str = str +'b';
            }
            else if(s.charAt(i) == 'e'){
                str = str + 'f';
            }
            else if(s.charAt(i) == 'i'){
                str = str + 'j';
            }
            else if(s.charAt(i) == 'o'){
                str = str + 'p';
            }
            else if(s.charAt(i) == 'u'){
                str = str + 'v';
            }
            else{
                str = str + s.charAt(i);
            }
        }
        System.out.println(str);
    }    
}
