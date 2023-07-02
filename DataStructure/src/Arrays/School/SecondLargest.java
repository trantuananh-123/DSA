package Arrays.School;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SecondLargest {

    public static int print2largest(int arr[], int n) {
        // Your code here
        boolean isExist = false;
        Arrays.sort(arr);
        int res = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != res) {
                res = arr[i];
                isExist = true;
                break;
            }
        }
        return isExist ? res : -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(print2largest(a, n));
    }
}
