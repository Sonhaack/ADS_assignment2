import java.util.ArrayList;

public class BinaryTree {

    BinaryTreeNode root;
    ArrayList<BinaryTreeNode> binaryTreeNodes;


    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return binaryTreeNodes.isEmpty();
    }

    public int size() {
        return binaryTreeNodes.size();
    }

    public boolean contains(BinaryTreeNode node, int element)
    {
        if(node.getLeftChild().getElement() == element)
        {
            return true;
        }
        if(node.getRightChild().getElement() == element)
        {
            return true;
        }
        else
            return false;
    }

    public ArrayList<BinaryTreeNode> inOrder()
    {
        ArrayList<BinaryTreeNode> inOrderList = new ArrayList<>();

        if(root == null)
            return null;

        return inOrderList;
    }

    public ArrayList<BinaryTreeNode> preOrder()
    {
        return null;
    }

    public ArrayList<BinaryTreeNode> postOrder()
    {
        return null;
    }

    public ArrayList<BinaryTreeNode> levelOrder()
    {
        return null;
    }

    public int height()
    {
        return 0;
    }


}
