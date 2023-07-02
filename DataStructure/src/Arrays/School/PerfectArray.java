package Arrays.School;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectArray {

    public static boolean isPerfect(int a[], int n) {
        // Your code here
        boolean res = true;
        for (int i = 0; i <= n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                res = false;
                break;
            }
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
        System.out.println(isPerfect(a, n) ? "PERFECT" : "NOT PERFECT");
    }
}
