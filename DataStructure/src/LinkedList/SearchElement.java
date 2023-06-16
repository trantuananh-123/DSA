package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            linkedList.push(sc.nextInt());
        }

        if (linkedList.contains(x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
