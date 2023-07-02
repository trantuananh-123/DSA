package Arrays.School;

import java.util.Scanner;

public class SumOfArray {

    public static int sum(int arr[], int n) {
        // Your code here
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(sum(a, n));
    }
}
