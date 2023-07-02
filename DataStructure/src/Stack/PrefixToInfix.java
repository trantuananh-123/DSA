package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        PrefixToInfix prefixToInfix = new PrefixToInfix();

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();

        Stack<String> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (!isOperator(c)) {
                stack.push(c + "");
            } else {
                String temp = "";
                temp = "(" + stack.pop() + c + stack.pop() + ")";
                stack.push(temp);
            }
        }
        System.out.println(stack.pop());
    }

    private static boolean isOperator(char character) {
        switch (character) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }
}
