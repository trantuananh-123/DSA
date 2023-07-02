package String;

import java.util.Scanner;

public class NumberOfSubStringInOther {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String s = s1.substring(i, j);
                if (s2.contains(s)) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
