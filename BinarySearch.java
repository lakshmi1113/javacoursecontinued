import java.util.Scanner;
class Search{
    int binarySearch(int arr[], int x){
        int l=0, r= arr.length -1;
        while(l<= r){
            int m = l+(r-l)/2;
            if(arr[m]== x){
                return m;
            }

            if(arr[m]<x){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return -1;
    }
}
public class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:-");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:-");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be found:-");
        int x = sc.nextInt();
        Search obj = new Search();
        int a = obj.binarySearch(arr, x);
        if(a == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element at"+a+"th index");
        }
       

    }
}