package Contest52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);

        for (int i = 0, j = 1; j <= m; j++) {
            if (list.get(i) == j) {
                i++;
                continue;
            }
            m -= j;
            res.add(j);
        }
        System.out.println(res.size());
        for (Integer i : res) {
            System.out.print(i + " ");
        }
    }
}
