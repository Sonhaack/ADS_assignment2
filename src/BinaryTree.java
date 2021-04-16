import java.util.ArrayList;

public class BinaryTree {

    //Checking to see if i'm in the new branch - anne
    BinaryTreeNode root;
    ArrayList<BinaryTreeNode> binaryTreeNodes = new ArrayList<>();


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

    public boolean contains(int element)
    {
        boolean flag = false;

        for (int i = 0; i < binaryTreeNodes.size() ; i++) {

            if(binaryTreeNodes.get(i).equals(element))
                flag = true;
        }
        return flag;
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

    public void printTree() {
        ArrayList<BinaryTreeNode> parent = new ArrayList<BinaryTreeNode>();
        parent.add(root);
        printT(parent, 64);
    }

    private void printT(ArrayList<BinaryTreeNode> parent, int left) {
        ArrayList<BinaryTreeNode> children = new ArrayList<BinaryTreeNode>();
        BinaryTreeNode current;
        boolean moreNodes = false;
        boolean firstNode = true;
        BinaryTreeNode dummy = new BinaryTreeNode(0);

        int dist = 0;
        System.out.println();
        System.out.println();

        while (!parent.isEmpty()) {
            current = parent.remove(0);

            if (firstNode) {
                printSpace(left);
                if (current.getElement() != 0)
                    System.out.print(current.getElement());
                dist = 2 * left;
                firstNode = false;

                if (current.getElement() != 0) {
                    if (current.getLeftChild() != null) {
                        children.add(current.getLeftChild());
                        moreNodes = true;
                    } else
                        children.add(dummy);
                    if (current.getRightChild() != null) {
                        children.add(current.getRightChild());
                        moreNodes = true;
                    } else
                        children.add(dummy);
                } else {
                    children.add(dummy);
                    children.add(dummy);
                }
            } else {
                if (current.getElement() != 0) {
                    printSpace(dist - 1);
                    System.out.print(current.getElement());
                    if (current.getLeftChild() != null) {
                        children.add(current.getLeftChild());
                        moreNodes = true;
                    } else
                        children.add(dummy);
                    if (current.getRightChild() != null) {
                        children.add(current.getRightChild());
                        moreNodes = true;
                    } else
                        children.add(dummy);
                } else {
                    printSpace(dist - 1);
                    System.out.print(" ");
                    children.add(dummy);
                    children.add(dummy);
                }
            }
        }

        if (moreNodes)
            printT(children, left / 2);

    }

    private void printSpace(int pos) {
        for (int i = 0; i < pos; i++)
            System.out.print(" ");
    }

}
