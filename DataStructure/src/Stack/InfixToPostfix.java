package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        InfixToPostfix infixToPostfix = new InfixToPostfix();

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                res.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.empty() && stack.peek() != '(') {
                    res.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && priority(c) <= priority(stack.peek())) {
                    res.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        System.out.println(res);
    }

    private static int priority(char character) {
        switch (character) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
