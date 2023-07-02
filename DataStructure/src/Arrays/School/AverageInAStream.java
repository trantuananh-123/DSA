package Arrays.School;

import java.util.Scanner;

public class AverageInAStream {

    public static float[] streamAvg(int[] arr, int n) {
        // Your code here
        float[] res = new float[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            res[i] = (float) sum / (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        float[] res = streamAvg(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
