package sieve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AMR11E_spoj {

    public static void main(String[] args) {
        AMR11E_spoj amr11E_spoj = new AMR11E_spoj();
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        List<Integer> sieve = amr11E_spoj.sieve(1000);

        while (t-- > 0) {
            int n = sc.nextInt();
            int nth = 1;
            int res = 0;
            int start = 30;
            boolean isFound = false;
            while (true) {
                int count = 0;
                for (Integer i : sieve) {
                    if (start % i == 0) {
                        count++;
                    }
                    if (count >= 3) {
                        if (nth == n) {
                            res = start;
                            isFound = true;
                            break;
                        }
                        count = 0;
                        nth++;
                    }
                }
                if (isFound) {
                    break;
                }
                start++;
            }
            System.out.println(res);
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
            if (prime[i]) {
                res.add(i);
            }
        }
        return res;
    }
}
