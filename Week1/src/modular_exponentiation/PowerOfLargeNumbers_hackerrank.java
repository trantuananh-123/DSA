package modular_exponentiation;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerOfLargeNumbers_hackerrank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger p = new BigInteger("1000000007");

        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());

            System.out.println(a.modPow(b, p));
        }
    }
}
