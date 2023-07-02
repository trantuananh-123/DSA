package Contest148;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int count1 = 0, count2 = 0;
            while (n % 2 == 0) {
                count1++;
                n /= 2;
            }
            while (n % 3 == 0) {
                count2++;
                n /= 3;
            }
            if (n == 1 && count1 <= count2) {
                System.out.println(2 * count2 - count1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
