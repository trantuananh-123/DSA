package Arrays.School;

import java.util.Scanner;

public class CountSmallerElements {

    public static long countOfElements(long arr[], long n, long x) {
        // Your code here
        long res = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long x = scanner.nextLong();
        long[] a = new long[(int) n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        System.out.println(countOfElements(a, n, x));
    }
}
