package Arrays.School;

import java.util.Arrays;
import java.util.Scanner;

public class PrintTheLeftElement {

    public static long leftElement(long arr[], long n) {
        // Your code here
        long res = 0;
        Arrays.sort(arr);
        int i = 0;
        int count = 0;
        while (i <= n - 1) {
            if (count == n - 1) {
                break;
            }
            arr[(int) n - i - 1] = -1;
            count++;
            if (count == n - 1) {
                break;
            }
            arr[i] = -1;
            count++;
            if (count == n - 1) {
                break;
            }
            i++;
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != -1) {
                res = arr[j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        System.out.println(leftElement(a, n));
    }
}
