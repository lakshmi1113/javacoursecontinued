import java.util.Scanner;
public class BubbleSort{
    static void bubbleSort(int[] arr, int n){
        int i,j, temp;
        boolean swapped;
        for(i=0; i<n-1; i++){
            swapped = false;
            for(j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements in the array:-");
        int x = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] array = new int[x];
        for(int i =0; i<x; i++){
            array[i] = sc.nextInt();
        }
        bubbleSort(array, x);
        System.out.println("SORTED ARRAY IS:-");
        for(int i =0; i<x; i++){
            System.out.print(array[i]);
        }
    }  
}