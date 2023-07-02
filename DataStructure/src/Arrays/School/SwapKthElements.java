package Arrays.School;

import java.util.Scanner;

public class SwapKthElements {

    public static void swapKth(int arr[], int n, int k) {
        // Your code here
        int temp = arr[k - 1];
        arr[k - 1] = arr[n - k];
        arr[n - k] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        swapKth(a, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
