package lists.linkedlist.tests;

import lists.linkedlist.ListNode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by omernizri on 30/04/2017.
 */
class ListNodeTest {
    @org.junit.jupiter.api.Test
    void getObject() {
        ListNode<String> listNode = new ListNode<String>("Blabla");
        assertEquals("Blabla", listNode.getData());
    }

    @org.junit.jupiter.api.Test
    void setObject() {
        ListNode<String> listNode = new ListNode<String>("Blabla");
        listNode.setObject("lorem ipsum");
        assertEquals("lorem ipsum", listNode.getData());
    }

    @org.junit.jupiter.api.Test
    void getNext() {
        ListNode<String> listNode = new ListNode<String>("Blabla");
        ListNode<String> next = new ListNode<String>("secondNode");
        listNode.setNext(next);
        assertEquals(next, listNode.getNext());
    }

}