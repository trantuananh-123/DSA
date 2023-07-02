package Arrays.Basic;

public class ImplementStackUsingArray {

    private static int top = -1;
    private static int[] arr = new int[1000];

    public static void push(int a) {
        // Your code here
        top++;
        arr[top] = a;
    }

    public static int pop() {
        // Your code here
        if (top == -1) {
            return top;
        }
        return arr[top--];
    }

    public static void main(String[] args) {
    }
}
