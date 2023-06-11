package sieve;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();

        int n = sc.nextInt();

        sieveOfEratosthenes.sieve(n);
    }

    private void sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i])
                System.out.print(i + " ");
        }

    }
}
