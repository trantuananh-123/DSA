package String;

import java.util.Arrays;
import java.util.Scanner;

public class CountPalindromicSubString {

    public static void main(String[] args) {
        CountPalindromicSubString countPalindromicSubString = new CountPalindromicSubString();

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = String.valueOf(chars);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if (countPalindromicSubString.isPalindromic(temp)) {
                    System.out.println(temp);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private boolean isPalindromic(String s) {
        if (s.length() == 1) {
            return true;
        }
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }
}
