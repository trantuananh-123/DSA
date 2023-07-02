package Arrays.School;

import java.util.Scanner;

public class PalindromicArray {

    public static int palinArray(int[] a, int n) {
        // Your code here
        int res = 1;
        for (int i = 0; i < n; i++) {
            if (!isPalin(a[i])) {
                res = 0;
                break;
            }
        }
        return res;
    }

    public static boolean isPalin(int x) {
        String s = String.valueOf(x);
        String reverseS = new StringBuilder(s).reverse().toString();
        return s.equals(reverseS);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(palinArray(a, n));
    }
}
