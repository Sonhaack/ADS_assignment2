public class main {

    public static void main(String[] args) {




        BinaryTreeNode root = new BinaryTreeNode(10);

        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(11);
        BinaryTreeNode node3 = new BinaryTreeNode(12);
        BinaryTreeNode node4 = new BinaryTreeNode(13);
        BinaryTreeNode node5 = new BinaryTreeNode(14);
        BinaryTreeNode node6 = new BinaryTreeNode(15);

        BinaryTreePrint print = new BinaryTreePrint();

        root.addLeftChild(node1);
        root.addRightChild(node3);

        node3.addRightChild(node4);
        node3.addLeftChild(node5);

        print.printTree(root);








    }
}
