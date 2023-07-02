package Arrays.School;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerAndLarger {

    public static int[] getMoreAndLess(int[] arr, int n, int x) {
        // Your code here
        int[] res = new int[2];
        Arrays.fill(res, 0);
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                res[0]++;
            }
            if (arr[i] >= x) {
                res[1]++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] res = getMoreAndLess(a, n, k);
        System.out.print(res[0] + " " + res[1]);
    }
}
