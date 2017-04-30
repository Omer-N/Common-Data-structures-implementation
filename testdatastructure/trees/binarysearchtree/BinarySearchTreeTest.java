package trees.binarysearchtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by omernizri on 30/04/2017.
 */
class BinarySearchTreeTest {
    @Test
    void remove() {
        BinarySearchTree<Double> doubleBinarySearchTree = new BinarySearchTree<>(-1.5);
        doubleBinarySearchTree.insert(-10.0);
        doubleBinarySearchTree.insert(0.0);
        assertTrue(doubleBinarySearchTree.contains(-1.5));

        doubleBinarySearchTree.remove(-1.5);
        assertFalse(doubleBinarySearchTree.contains(-1.5));
    }

    @Test
    void insert() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>(-8);
        binarySearchTree.insert(5);
        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
    }

    @Test
    void size() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>(-8);
        binarySearchTree.insert(5);
        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
        assertEquals(4, binarySearchTree.size());
    }

    @Test
    void height() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>(-8);
        binarySearchTree.insert(5);
        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
        assertEquals(3, binarySearchTree.height());

    }

}