import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (k == a[m]) {
                System.out.println(m + 1);
                break;
            }
            if (k < a[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
    }
}
