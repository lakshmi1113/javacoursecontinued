import java.util.Scanner;

public class BinaryRecursion1 {

    static int binarySearch(int[] arr, int l, int r, int x) {

        if (r >= l) {

            int m = l + (r - l) / 2;

            if (arr[m] == x) {

                return m;

            }

            if (arr[m] > x) {

                return binarySearch(arr, l, m - 1, x);

            }

            return binarySearch(arr, m + 1, r, x);

        }

        return -1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:-");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:-");

        for (int i = 0; i <= n + 1; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the element to be found:-");

        int x = sc.nextInt();

        int a = binarySearch(arr, 0, n - 1, x);

        if (a == -1) {

            System.out.println("Element not found");

        } else {

            System.out.println("Element at" + a + "th index");

        }

    }

}
