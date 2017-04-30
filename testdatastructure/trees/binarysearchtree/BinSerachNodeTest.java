package trees.binarysearchtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by omernizri on 30/04/2017.
 */
class BinSerachNodeTest {
    @Test
    void contains() {
        BinSerachNode<Integer> binSerachNode = new BinSerachNode<>(10);
        assertTrue(binSerachNode.contains(10));
        assertFalse(binSerachNode.contains(8));
        binSerachNode.insert(15);
        binSerachNode.insert(-10);

        assertTrue(binSerachNode.contains(10));
        assertTrue(binSerachNode.contains(15));
        assertTrue(binSerachNode.contains(-10));
        assertFalse(binSerachNode.contains(8));

    }

    @Test
    void insert() {
        BinSerachNode<Integer> node = new BinSerachNode<>(5);
        node.insert(10);
        node.insert(-10);
        assertEquals(5, Math.toIntExact(node.getData()));
        assertEquals(10, Math.toIntExact(node.getRightNode().getData()));
        assertEquals(-10, Math.toIntExact(node.getLeftNode().getData()));
    }

    @Test
    void size() {
        BinSerachNode<Integer> node = new BinSerachNode<>(5);
        assertEquals(1, node.size());
        node.insert(2);
        node.insert(3);
        assertEquals(3, node.size());
    }

    @Test
    void height() {
        BinSerachNode<Integer> node = new BinSerachNode<>(5);
        assertEquals(0, node.height());
        node.insert(2);
        node.insert(3);
        assertEquals(2, node.height());

        node.insert(6);
        assertEquals(2, node.height());
        node.insert(7);
        assertEquals(2, node.height());

        node.insert(-10);
        assertEquals(2, node.height());

        node.insert(-12);
        assertEquals(3, node.height());

        node.insert(15);
        node.insert(30);
        assertEquals(4, node.height());

    }

    @Test
    void remove() {
        BinSerachNode<Integer> node = new BinSerachNode<>(8);
        node.insert(-2);
        assertTrue(node.contains(-2));
        node.remove(-2);
        assertFalse(node.contains(-2));

        node.insert(15);
        assertTrue(node.contains(15));
        node.remove(15);
        assertFalse(node.contains(15));

        node = new BinSerachNode<>(10);
        node.insert(15);
        node.insert(-10);
        assertTrue(node.contains(10));
        node.remove(10);
        assertFalse(node.contains(10));
    }

}