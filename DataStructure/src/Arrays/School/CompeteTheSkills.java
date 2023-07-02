package Arrays.School;

import java.util.Scanner;

public class CompeteTheSkills {

    public static long ca = 0, cb = 0;

    public static void scores(long a[], long b[]) {
        // store the answer as
        // GFG.ca=3;
        // GFG.cb=5;
        // Your code goes here
        ca = 0;
        cb = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                ca++;
            }
            if (a[i] < b[i]) {
                cb++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextLong();
        }
        scores(a, b);
        System.out.println(ca + " " + cb);
    }
}
