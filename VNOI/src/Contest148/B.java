package Contest148;

import java.util.Arrays;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            int[] a = new int[n + 1];
            int[] b = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = scanner.nextInt();
                b[i] = a[i];
            }

            boolean res = true;
            for (int i = 1; i < n; i++) {
                if (a[i] > a[i + 1]) {
                    res = false;
                }
            }
            if (res) {
                System.out.println("YES");
            } else {
                res = true;
                Arrays.sort(b);
                for (int i = n - x + 1; i <= x; i++) {
                    System.out.println(a[i]);
                    System.out.println(b[i]);
                    if (a[i] != b[i]) {
                        res = false;
                        break;
                    }
                }
                if (res) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
