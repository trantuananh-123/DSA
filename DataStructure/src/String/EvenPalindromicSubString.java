package String;

import java.util.Arrays;
import java.util.Scanner;

public class EvenPalindromicSubString {

    public static void main(String[] args) {
        EvenPalindromicSubString countPalindromicSubString = new EvenPalindromicSubString();

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = String.valueOf(chars);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if (countPalindromicSubString.isEvenPalindromic(temp)) {
                    System.out.println(temp);
                    count = 1;
                    break;
                }
            }
        }
        System.out.println(count != 0 ? "YES" : "NO");
    }

    private boolean isEvenPalindromic(String s) {
        if (s.length() % 2 == 0) {
            return false;
        }
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }
}
