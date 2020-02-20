package CourseraDataStructure;

public class TreeTraversal<AnyType> {
    class Node {
        AnyType data;
        Node left;
        Node right;

        public Node(AnyType data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }

    }

    void inOrderTraversal(Node node) {
        if (node == null) {
            return;

        }

        this.inOrderTraversal(node.left);
        System.out.println(node.data);
        this.inOrderTraversal(node.right);

    }

    void preOrderTraversal(Node node) {
        if (node == null) {
            return;

        }

        System.out.println(node.data);
        this.preOrderTraversal(node.left);
        this.preOrderTraversal(node.right);

    }

    void postOrderTraversal(Node node) {
        if (node == null) {
            return;

        }

        this.postOrderTraversal(node.left);
        this.postOrderTraversal(node.right);
        System.out.println(node.data);

    }

    Node insert(AnyType data) {
        var newNode = new Node(data);
        return newNode;

    }


    public static void main(String[] args) {
        var treeTraversal = new TreeTraversal<String>();
        var root = treeTraversal.insert("Les");
        root.left = treeTraversal.insert("Cathy");
        root.left.left = treeTraversal.insert("Alex");
        root.left.right = treeTraversal.insert("Frank");
        root.right = treeTraversal.insert("Sam");
        root.right.left = treeTraversal.insert("Nancy");
        root.right.right = treeTraversal.insert("Violet");
        root.right.right.left = treeTraversal.insert("Tony");
        root.right.right.right = treeTraversal.insert("Wendy");
        treeTraversal.inOrderTraversal(root);
        treeTraversal.preOrderTraversal(root);
        treeTraversal.postOrderTraversal(root);

    }


}
