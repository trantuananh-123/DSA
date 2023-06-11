package prime_factorization;

import java.util.*;

public class PrimeFactor {

    public static void main(String[] args) {
        PrimeFactor primeFactor = new PrimeFactor();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] sieve = primeFactor.sieve(n);
        Set<Integer> res = new HashSet<>();

        while (n != 1) {
            res.add(sieve[n]);
            n /= sieve[n];
        }
        for (Integer i : res) {
            System.out.print(i + " ");
        }
    }

    private int[] sieve(int n) {
        int[] spf = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            spf[i] = i;
            if (i >= 4 && i % 2 == 0) {
                spf[i] = 2;
            }
        }

        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= n; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        return spf;
    }
}
