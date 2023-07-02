package Arrays.School;

import java.util.Scanner;

public class PrintAnElement_Set2 {

    public static int findElementAtIndex(int a[], int n, int key) {
        // Your code here
        return a[key];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(findElementAtIndex(a, n, k));
    }
}
