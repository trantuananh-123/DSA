package Arrays.School;

import java.util.ArrayList;
import java.util.Scanner;

public class ValueEqualToIndexValue {

    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) {
                res.add(i + 1);
            }
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
        ArrayList<Integer> res = valueEqualToIndex(a, n);
        for (Integer i : res) {
            System.out.print(i + " ");
        }
    }
}
