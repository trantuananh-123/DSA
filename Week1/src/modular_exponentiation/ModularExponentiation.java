package modular_exponentiation;

import java.util.Scanner;

public class ModularExponentiation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long p = sc.nextLong();
        long res = 1;

        x %= p;
        if (x == 0) {
            System.out.println(0);
        } else {
            while (y > 0) {
                if ((y & 1) != 0) {
                    res = (res * x) % p;
                }
                y >>= 1;
                x = (x * x) % p;
            }
            System.out.println(res);
        }
    }
}
