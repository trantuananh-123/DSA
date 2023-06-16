import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        quickSort.quickSort(list, 0, list.size() - 1);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private int partitionIndex(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;

        for (int j = 0; j < high; j++) {
            if (list.get(j) < pivot) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);
        return i + 1;
    }

    private void quickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            int index = partitionIndex(list, low, high);
            quickSort(list, low, index - 1);
            quickSort(list, index + 1, high);
        }
    }

}
