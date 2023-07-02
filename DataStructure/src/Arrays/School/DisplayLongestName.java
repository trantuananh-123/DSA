package Arrays.School;

import java.util.Scanner;

public class DisplayLongestName {

    public static String longest(String names[], int n) {
        String res = names[0];
        for (int i = 1; i < n; i++) {
            if (res.length() < names[i].length()) {
                res = names[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();
        }
        System.out.println(longest(s, n));
    }
}
