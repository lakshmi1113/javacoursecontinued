import java.util.Scanner;
public class QuickSort {
    static void swap(int[] arr, int a, int b){
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int partition(int[] arr, int low, int high){
        int pi = arr[high];
        int i = low-1;
        for(int j = low; j<=high-1; j++){
            if(arr[j]< pi){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements in the array:-");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        printArray(arr);
    }
}
