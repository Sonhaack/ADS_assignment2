

public class BinaryTreeNode {

    private int number;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;


    public BinaryTreeNode(int number) {

        this.number = number;
    }

    public int getElement() {
        return number;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void addLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void addRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
