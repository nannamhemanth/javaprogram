
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Tree {
    Node root;

    Tree() {
        this.root = null;
    }

    void insert(int n) {
        Node newNode = new Node(n);
        if (this.root == null) {
            this.root = newNode;
        } else {
            Node curr = this.root;
            while (true) {
                if (n > curr.data) {
                    if (curr.right == null) {
                        curr.right = newNode;
                        break;
                    } else {
                        curr = curr.right;
                    }
                } else {
                    if (curr.left == null) {
                        curr.left = newNode;
                        break;
                    } else {
                        curr = curr.left;
                    }
                }
            }
        }
    }
    void preorder(Node root) {
        if (root != null) {
            preorder(root.left);
            System.out.println(root.data);
            preorder(root.right);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(4);
        t.insert(6 );
        t.insert(1);
        t.preorder(t.root);
    }
}