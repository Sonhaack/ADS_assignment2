public class main {

    public static void main(String[] args) {


        BinarySearchTree binarySearchTree = new BinarySearchTree();

        BinaryTreeNode root = new BinaryTreeNode(10);
        binarySearchTree.setRoot(root);
        binarySearchTree.insert(5);


        binarySearchTree.printTree();




    }
}
