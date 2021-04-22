
public class BinarySearchTree extends BinaryTree {

    public BinarySearchTree() {
    }

    public BinarySearchTree(BinaryTreeNode node) {
        super.setRoot(node);
    }

    public void insert(int element) {

        BinaryTreeNode tmpNode = null;

        if (super.getRoot() == null) {
            super.setRoot(new BinaryTreeNode(element, null, null));
        }

        if (!super.contains(element)) {
            tmpNode = super.getRoot();
            while (true) {
                if (tmpNode.getElement() <= element) {
                    if (tmpNode.getRightChild() != null) {
                        tmpNode = tmpNode.getRightChild();
                    } else {
                        tmpNode.addRightChild(new BinaryTreeNode(element));
                        break;
                    }
                } else {
                    if (tmpNode.getLeftChild() != null) {
                        tmpNode = tmpNode.getLeftChild();
                    } else {
                        tmpNode.addLeftChild(new BinaryTreeNode(element));
                        break;
                    }

                }
            }

        }

    }


    public BinaryTreeNode remove(int element)
    {
        return removeNode(getRoot(), element);
    }

    private BinaryTreeNode removeNode(BinaryTreeNode root, int data) {

        if(root == null) return root;

        if(data < root.getElement()) {
            BinaryTreeNode leftChild = root.getLeftChild();
            removeNode(root.getLeftChild(), data);

        } else if(data > root.getElement()) {
            root.addRightChild(removeNode(root.getRightChild(), data));
        } else {
            // node with no leaf nodes
            if(root.getLeftChild() == null && root.getRightChild() == null) {

                return null;
            } else if(root.getLeftChild() == null) {
                // node with one node (no left node)

                return root.getRightChild();
            } else if(root.getRightChild() == null) {
                // node with one node (no right node)

                return root.getLeftChild();
            } else {
                // nodes with two nodes
                // search for min number in right sub tree
                Integer minValue = minValue(root.getRightChild());
                root.setElement(minValue);
                root.addRightChild(removeNode(root.getRightChild(), minValue));

            }
        }

        return root;
    }

    private Integer minValue(BinaryTreeNode node) {

        if(node.getLeftChild() != null) {
            return minValue(node.getLeftChild());
        }
        return node.getElement();
    }


    public int findMin()
    {
        return 0;
    }

    public int findMax()
    {
        return 0;

    }

    public void rebalance()
    {
        //
    }


    public void removeElement(int i) {
    }
}
