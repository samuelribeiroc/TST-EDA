import java.util.Scanner;

class BST {

    private NodeBST root;

    public BST() {    }

    public void addNode(int data) {
        if (this.root == null) {
            NodeBST newNode = new NodeBST(data);
            this.root = newNode;
        } else {
            addNode(data, this.root);
        }
    }

    private void addNode(int data, NodeBST node) {
        NodeBST newNode = new NodeBST(data);
        if (node != null) {
            if (data < node.getData()) {
                if (node.getLeft() == null) {
                    node.setLeft(newNode);
                } else {
                    addNode(data, node.getLeft());
                }
            } else {
                if (node.getRight() == null) {
                    node.setRight(newNode);
                } else {
                    addNode(data, node.getRight());
                }
            }
        }
    }

    public void findMax() {
        NodeBST aux = this.root;
        String way = "";

        while (aux != null) {
            way += aux.getData() + " ";
            aux = aux.getRight();
        }

        System.out.println(way.trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        BST bst = new BST();

        for(String element : entrada) {
            bst.addNode(Integer.parseInt(element));
        }

        bst.findMax();
    }
}

class NodeBST {

    private int data;
    private NodeBST left;
    private NodeBST right;

    public NodeBST(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public int getData() {
        return data;
    }

    public void setLeft(NodeBST left) {
        this.left = left;
    }

    public NodeBST getLeft() {
        return left;
    }

    public void setRight(NodeBST right) {
        this.right = right;
    }

    public NodeBST getRight() {
        return right;
    }
}