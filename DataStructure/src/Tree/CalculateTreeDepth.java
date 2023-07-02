package Tree;

import java.util.Scanner;

public class CalculateTreeDepth {

    public static void main(String[] args) {
        CalculateTreeDepth calculateTreeDepth = new CalculateTreeDepth();

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(calculateTreeDepth.depth(s, 0, s.length()));

    }

    public int depth(String tree, int index, int n) {
        if (index >= n || tree.charAt(index) == 'l') {
            return 0;
        }
        index++;
        int left = depth(tree, index, n);
        index++;
        int right = depth(tree, index, n);
        return Math.max(left, right) + 1;
    }
}
