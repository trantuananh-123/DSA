package String;

import java.util.Scanner;

public class SubStringOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int totalDigit = (int) Math.log10(n);

        int d = (int) (Math.pow(10, totalDigit) + 0.5);

        int k = d;

        while (n > 0) {
            while (d > 0) {
                System.out.println(n / d);
                d = d / 10;
            }
            n = n % k;
            k = k / 10;
            d = k;
        }
    }
}
