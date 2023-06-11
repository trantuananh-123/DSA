package sieve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Noldbach_problem_codeforces {
    public static void main(String[] args) {
        Noldbach_problem_codeforces noldbach_problem_codeforces = new Noldbach_problem_codeforces();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        List<Integer> sieve = noldbach_problem_codeforces.sieve(n + 10);
        for (int i = 0; i < sieve.size() - 1; i++) {
            int sum = sieve.get(i) + sieve.get(i + 1) + 1;
            if (sum > n)
                break;
            if (sieve.contains(sum)) {
                count++;
            }
        }
        if (count >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private List<Integer> sieve(int n) {
        List<Integer> res = new ArrayList<>();
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
                res.add(i);
        }
        return res;
    }
}
