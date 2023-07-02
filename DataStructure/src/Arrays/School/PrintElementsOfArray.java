package Arrays.School;

import java.util.Scanner;

public class PrintElementsOfArray {

    public static void printArray(int arr[], int n) {
        // Your code here
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        printArray(a, n);
    }
}
