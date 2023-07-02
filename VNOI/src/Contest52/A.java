package Contest52;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        float kbSize = (float) n / 1024;
        float fileSize = kbSize / 4;
        String integerPart = String.valueOf(fileSize).split("\\.")[0];
        String decimalPart = String.valueOf(fileSize).split("\\.")[1];
        if (decimalPart.equals("0")) {
            System.out.println(Integer.parseInt(integerPart) * 4);
        } else {
            System.out.println((Integer.parseInt(integerPart) + 1) * 4);
        }
    }
}
