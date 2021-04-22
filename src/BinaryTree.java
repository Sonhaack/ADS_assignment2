import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    //I will try to do it without an ArrayList, as I can not seem to get it to work
    private BinaryTreeNode root;
    //ArrayList<BinaryTreeNode> binaryTreeNodes = new ArrayList<>();


    public BinaryTree() {

    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else return false;
    }

    public int size()
    {
        ArrayList<Integer> tmp = inOrder();
        return tmp.size();    }


    //when i ran the test, this method was the first to give a compiler error. therefore i made a new one with the BinaryTreeNode as argument
    //so first we check if the node is null and returns false if yes. Then we check if the node is the same as the element, and returns true. Otherwise, we will if the element is smaller than the root.getElement, and if it is we know
    //that it is a left child. if not then it is a right child. Håber det virker boys

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(BinaryTreeNode node, int value) {
        if(node == null)
            return false;
        else if (node.getElement()==value)
            return true;
        else {
            if(value < node.getElement())
                return contains(node.getLeftChild(), value);
            else
                return contains(node.getRightChild(), value);
        }
    }

    public ArrayList<Integer> inOrder()
    {
        //left-node-right
        BinaryTreeNode currentNode = root;
        if (isEmpty()) {
            return null;
        }
        return inOrder(currentNode, new ArrayList<>());
    }

    private ArrayList<Integer> inOrder(BinaryTreeNode node, ArrayList<Integer> res){
        if (node == null){
            return null;
        }
        inOrder(node.getLeftChild(), res);
        res.add(node.getElement());
        inOrder(node.getRightChild(), res);
        return res;
    }


    public ArrayList<Integer> preOrder()
    {
        BinaryTreeNode currentNode = root;
        //node-left-right
        if (isEmpty()) {
            return null;
        } else {
            return preOrder(currentNode, new ArrayList<>());
        }
    }

    private ArrayList<Integer> preOrder(BinaryTreeNode node, ArrayList<Integer> res){
        if (node == null){
            return null;
        }
        res.add(node.getElement());
        preOrder(node.getLeftChild(), res);
        preOrder(node.getRightChild(), res);

        return res;
    }

    public ArrayList<Integer> postOrder()
    {
        BinaryTreeNode currentNode = root;
        if (isEmpty()) {
            return null;
        } else {
            return postOrder(currentNode, new ArrayList<>());
        }
    }

    public ArrayList<Integer> postOrder(BinaryTreeNode node, ArrayList<Integer> res) {
        if (node == null){
            return null;
        }
        postOrder(node.getLeftChild(), res);
        postOrder(node.getRightChild(), res);
        res.add(node.getElement());

        return res;
    }

    public ArrayList<Integer> levelOrder() {
        ArrayList<Integer> toReturn = new ArrayList<Integer>();

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();

        BinaryTreeNode currentNode;

        if (isEmpty()) {
            return null;
        }
        queue.add(root);

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            if (currentNode.getLeftChild() != null)
                queue.add(currentNode.getLeftChild());
            if (currentNode.getRightChild() != null)
                queue.add(currentNode.getRightChild());
            toReturn.add(currentNode.getElement());
        }
        return toReturn;
    }


    public int height() {
        if (root == null)
            return -1;

        Queue<BinaryTreeNode> heightQueue = new LinkedList<>();

        heightQueue.add(root);
        int height = -1;

        while (true) {
            int nodeCount = heightQueue.size();
            if (nodeCount == 0)
                return height;
            else
                height++;

            while (nodeCount > 0) {
                BinaryTreeNode poll = heightQueue.poll();
                if (poll.getLeftChild() != null)
                    heightQueue.add(poll.getLeftChild());
                if (poll.getRightChild() != null)
                    heightQueue.add(poll.getRightChild());
                nodeCount--;
            }
        }
    }


}
