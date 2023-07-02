package Arrays.School;

import java.util.Scanner;

public class SumOfSeries {

    public static long seriesSum(int n) {
        // Your code here
        return (long) n * (long) (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(seriesSum(n));
    }
}
