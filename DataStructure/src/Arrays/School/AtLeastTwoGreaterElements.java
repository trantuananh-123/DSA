package Arrays.School;

import java.util.Arrays;
import java.util.Scanner;

public class AtLeastTwoGreaterElements {

    public static long[] findElements(long a[], long n) {
        // Your code here
        Arrays.sort(a);
        long[] res = new long[a.length - 1];
        for (int i = 0; i < n - 2; i++) {
            res[i] = a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        long[] res = findElements(a, n);
        for (int i = 0; i < n - 2; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
