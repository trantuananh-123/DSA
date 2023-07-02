package Arrays.School;

import java.util.Scanner;

public class JavaArrays_Set1 {

    public static String average(int A[], int N) {
//        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        float avg = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        avg = (float) sum / N;
        return sum + " " + String.format("%.2f", avg);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(average(a, n));
    }
}
