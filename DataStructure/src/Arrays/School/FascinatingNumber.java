package Arrays.School;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FascinatingNumber {

    public static boolean fascinating(long n) {
        // code here
        long n2 = n * 2;
        long n3 = n * 3;
        String s = String.valueOf(n) + n2 + n3;
        return isFascinating(s);
    }

    public static boolean isFascinating(String s) {
        if (s.length() < 3) {
            return false;
        }
        List<Integer> digitList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int num = Integer.parseInt(s.charAt(i) + "");
            if (digitList.size() == 0) {
                digitList.add(num);
            } else {
                if (num != 0) {
                    if (digitList.contains(num)) {
                        return false;
                    } else {
                        digitList.add(num);
                    }
                }
            }
        }
        if (digitList.size() == 9) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(fascinating(n) ? "Fascinating" : "Not Fascinating");
    }
}
