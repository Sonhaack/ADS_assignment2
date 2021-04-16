

public class BinarySearchTree extends BinaryTree {

    public void insert(int element)
    {
        if(!(this.contains(element)))
        {
            BinaryTreeNode node = new BinaryTreeNode(element);
            binaryTreeNodes.add(node);

            for (int i = 0; i <binaryTreeNodes.size() ; i++)
            {
                if(binaryTreeNodes.get(i).getElement() > node.getElement())
                {
                    if(binaryTreeNodes.get(i).getLeftChild() == null)
                    {
                        binaryTreeNodes.get(i).addLeftChild(node);
                    }
                }
                else if(binaryTreeNodes.get(i).getElement() < node.getElement())
                {
                    if(binaryTreeNodes.get(i).getRightChild() == null)
                    {
                        binaryTreeNodes.get(i).addRightChild(node);
                    }
                }
                System.out.println("--------------------------");
            }
        }
    }

    public void removeElement(int element)
    {
        //
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


}
