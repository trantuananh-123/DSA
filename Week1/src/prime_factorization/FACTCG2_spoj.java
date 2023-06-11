package prime_factorization;

import java.util.Arrays;
import java.util.Scanner;

public class FACTCG2_spoj {

    public static void main(String[] args) {
        FACTCG2_spoj factcg2_spoj = new FACTCG2_spoj();
        Scanner sc = new Scanner(System.in);

        try {
            int[] sieve = factcg2_spoj.sieve(10000007);
            while (sc.hasNextLine()) {
                String n = sc.nextLine();
                if (n.equals("") || n.equals("\n")) {
                    break;
                } else {
                    int num = Integer.parseInt(n);
                    if (num == 1) {
                        System.out.println(1);
                        continue;
                    }
                    System.out.print("1 x");
                    while (sieve[num] != 0 && num % sieve[num] == 0) {
                        System.out.print(" " + sieve[num] + " x");
                        if (sieve[num] == 0) {
                            break;
                        }
                        num /= sieve[num];
                    }
                    System.out.println(" " + num);
                }
            }
        } catch (Exception e) {

        }
    }

    private int[] sieve(int n) {
        int[] spf = new int[n];
        Arrays.fill(spf, 0);
        try {

            spf[0] = spf[1] = 1;

            for (int i = 2; i * i < spf.length; i++)
                if (spf[i] == 0)
                    for (int j = i * i; j < spf.length; j += i)
                        if (spf[j] == 0) spf[j] = i;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return spf;
    }
}
