import java.util.ArrayList;
import java.util.PriorityQueue;

class HuffmanCoding {
    static class Node implements Comparable<Node> {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }

        public int compareTo(Node n2) {
            if (this.data == n2.data) {
                return 1;
            } else {
                return this.data - n2.data;
            }
        }

    }

    public ArrayList<String> huffmanCodes(String str, int f[], int N) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int i = 0; i < f.length; i++) {
            pq.add(new Node(f[i]));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            Node root = new Node(left.data + right.data);
            root.left = left;
            root.right = right;

            pq.add(root);
        }

        Node root = pq.poll();
        ArrayList<String> l = new ArrayList<>();
        preorder(root, l, "");
        return l;
    }

    public static void preorder(Node root, ArrayList<String> l, String ans) {
        if (root.left == null && root.right == null) {
            l.add(ans);
            return;
        }

        preorder(root.left, l, ans + "0");
        preorder(root.right, l, ans + "1");
    }
}