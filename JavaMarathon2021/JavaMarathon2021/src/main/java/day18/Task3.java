package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] num = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int numbers : num) {
            addNode(numbers, root);
        }
        dfs(root);
    }

    public static void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.getLeftNode());
        System.out.print(node.getValue()+" ");
        dfs(node.getRightNode());
    }

    public static void addNode(int value, Node root) {
        if (root == null)
            throw new IllegalArgumentException("Пустой узел");
        Node newNode = root;
        Node current = null;
        while (newNode != null) {
            current = newNode;
            if (value < current.getValue()) {
                newNode = newNode.getLeftNode();
            } else {
                newNode = newNode.getRightNode();
            }
        }

        if (value < current.getValue()) {
            current.setLeftNode(new Node(value));
        } else {
            current.setRightNode(new Node(value));
        }

    }
}

class Node {
    private Node rightNode;
    private Node leftNode;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void newNode(int value, Node node) {

    }
}

