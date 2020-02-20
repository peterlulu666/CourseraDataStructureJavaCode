package CourseraDataStructure;

class Node<AnyType> {
    AnyType data;
    Node left;
    Node right;

    public Node(AnyType data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }

}

class Traversal<AnyType> {
    void inOrderTraversal(Node node) {
        if (node == null) {
            return;

        }

        this.inOrderTraversal(node.left);
        System.out.println(node.data);
        this.inOrderTraversal(node.right);

    }

    void preOrderTraversal(Node node){
        if (node == null) {
            return;

        }

        System.out.println(node.data);
        this.preOrderTraversal(node.left);
        this.preOrderTraversal(node.right);

    }

    void postOrderTraversal(Node node){
        if (node == null) {
            return;

        }

        this.postOrderTraversal(node.left);
        this.postOrderTraversal(node.right);
        System.out.println(node.data);

    }


    Node insertNode(AnyType data) {
        var newNode = new Node<AnyType>(data);
        return newNode;

    }

}

public class BinaryTreeTraversal {
    public static void main(String[] args) {
        var traversal = new Traversal<String>();
        var root = traversal.insertNode("Les");
        root.left = traversal.insertNode("Cathy");
        root.left.left = traversal.insertNode("Alex");
        root.left.right = traversal.insertNode("Frank");
        root.right = traversal.insertNode("Sam");
        root.right.left = traversal.insertNode("Nancy");
        root.right.right = traversal.insertNode("Violet");
        root.right.right.left = traversal.insertNode("Tony");
        root.right.right.right = traversal.insertNode("Wendy");
//        traversal.inOrderTraversal(root);
//        traversal.preOrderTraversal(root);
        traversal.postOrderTraversal(root);      

    }

}
