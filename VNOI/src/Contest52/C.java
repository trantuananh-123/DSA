package Contest52;

import java.util.Scanner;

public class C {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            long n = scanner.nextLong();

            long res = 0;
            if (a % b == 0) {
                res = -1;
            } else {
                long k = (n + a - 1) / a;
                res = k * a;
                if (res % b == 0) {
                    res += a;
                }
            }
            System.out.println(res);
        }
    }
}
