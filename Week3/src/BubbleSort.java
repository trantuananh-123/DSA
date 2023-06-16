import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Collections.swap(list, j, j + 1);
                    isSwapped = true;
                }
                if (!isSwapped) {
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
