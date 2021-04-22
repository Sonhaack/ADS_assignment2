import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BinarySearchTreeTest {
    private BinarySearchTree binarySearchTree;
    private BinaryTreePrint binaryTreePrint = new BinaryTreePrint();

    @BeforeEach
    void setup() {
        binarySearchTree = new BinarySearchTree();
    }

    @AfterEach
    void tearDown() {
        binarySearchTree = null;
    }

    private void buildTree() {
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);
        binarySearchTree.insert(3);
        binarySearchTree.insert(8);
        binarySearchTree.insert(10);
        binaryTreePrint.printTree(binarySearchTree.getRoot());
    }

    private void buildLargerTree() {
        binarySearchTree.insert(55);
        binarySearchTree.insert(36);
        binarySearchTree.insert(46);
        binarySearchTree.insert(7);
        binarySearchTree.insert(10);
        binarySearchTree.insert(23);
        binarySearchTree.insert(66);
        binarySearchTree.insert(22);
        binarySearchTree.insert(11);
        binarySearchTree.insert(6);
        binaryTreePrint.printTree(binarySearchTree.getRoot());
    }

    @Test
    void addFirstNode() {
        binarySearchTree.insert(5);
        assertEquals(5, binarySearchTree.getRoot().getElement());
    }

    @Test
    void insertNoDuplicates() {
        buildTree();
        assertEquals(5, binarySearchTree.size());
    }

    @Test
    void insertNDuplicates() {
        buildTree();
        buildTree();
        assertEquals(5, binarySearchTree.size());
    }

    @Test
    void removeExisting() {
        buildLargerTree();
        binarySearchTree.removeElement(6);
        binaryTreePrint.printTree(binarySearchTree.getRoot());
        assertEquals(9, binarySearchTree.size());
    }

    @Test
    void removeNonExisting() {
        buildTree();
        binarySearchTree.removeElement(420);
        assertEquals(5, binarySearchTree.size());
    }

    //min og max virker ikke og giver begge dele 0... hmm
    @Test
    void findMin() {
        buildLargerTree();
        assertEquals(7, binarySearchTree.findMin());
    }

    @Test
    void findMax() {
        buildLargerTree();
        assertEquals(66, binarySearchTree.findMax());
    }


    //think i fixed it
    @Test
    void rebalance() {
        buildLargerTree();
        binarySearchTree.rebalance();
        binaryTreePrint.printTree(binarySearchTree.getRoot());
        assertEquals(6, binarySearchTree.height());
    }
}