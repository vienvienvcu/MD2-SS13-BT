package tree;

public class BinaryTree {
    Node root;

    private Node addNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addNode(current.left, value);
        }
        if (value > current.value) {
            current.right = addNode(current.right, value);
        }else {
            return current;
        }
        return current;
    }
    private boolean contains(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value ? contains(current.left, value) : contains(current.right, value);
    }
}
