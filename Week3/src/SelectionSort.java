import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (list.get(j) < list.get(min_idx)) {
                    min_idx = j;
                }
            Collections.swap(list, min_idx, i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
