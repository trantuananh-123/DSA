package String;

import java.util.Scanner;

public class SubStringReversePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder reverse = new StringBuilder(s).reverse();

        int i = 0, j = reverse.length() - 1;
        while (i < j) {
            reverse.setCharAt(i, '*');
            reverse.setCharAt(j, '*');
            i++;
            j--;
        }
        System.out.println(reverse);
    }
}
