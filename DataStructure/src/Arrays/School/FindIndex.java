package Arrays.School;

import java.util.Scanner;

public class FindIndex {

    public static int[] findIndex(int a[], int N, int key) {
        // Your code here
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        for (int i = 0, j = N - 1; i < N || j >= 0; i++, j--) {
            if (a[i] == key && res[0] == -1) {
                res[0] = i;
            }
            if (a[j] == key && res[1] == -1) {
                res[1] = j;
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
        int[] res = findIndex(a, n, k);
        System.out.print(res[0] + " ");
        System.out.println(res[1]);
    }
}
