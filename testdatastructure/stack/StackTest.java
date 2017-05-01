package stack;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by omernizri on 01/05/2017.
 */
class StackTest {
    @Test
    void insert() {
        Stack<String> myStack = new Stack<>();
        myStack.insert("Inserted first");
        myStack.insert("Inserted second");
        myStack.insert("Inserted third");
    }

    @Test
    void pop() {
        Stack<String> myStack = new Stack<>();
        myStack.insert("Inserted first");
        myStack.insert("Inserted second");
        myStack.insert("Inserted third");

        assertEquals("Inserted third", myStack.pop());
        assertEquals("Inserted second", myStack.pop());
        assertEquals("Inserted first", myStack.pop());
        try {
            myStack.pop();
            fail("Should throw exception when there aren't more objects in the stack");
        } catch (NoSuchElementException ex) {

        }
    }

    @Test
    void peek() {
        Stack<String> myStack = new Stack<>();
        try {
            myStack.peek();
            fail("Should throw exception when peeking into empty stack");
        } catch (NoSuchElementException ex) {

        }

        myStack.insert("Inserted first");
        assertEquals("Inserted first", myStack.peek());
        myStack.insert("Inserted second");
        assertEquals("Inserted second", myStack.peek());

        myStack.pop();
        assertEquals("Inserted first", myStack.pop());
    }

    @Test
    void search() {
        Stack<String> myStack = new Stack<>();
        assertEquals(-1, myStack.search("abc"));

        myStack.insert("abc");
        assertEquals(0, myStack.search("abc"));

        myStack.insert("second string");
        assertEquals(0, myStack.search("second string"));
        assertEquals(1, myStack.search("abc"));

        myStack.pop();
        assertEquals(-1, myStack.search("second string"));
    }

    @Test
    void isEmpty() {
        Stack<String> myStack = new Stack<>();
        assertTrue(myStack.isEmpty());
        myStack.insert("Inserted first");
        assertFalse(myStack.isEmpty());
        myStack.insert("Inserted second");
        assertFalse(myStack.isEmpty());

        myStack.pop();
        assertFalse(myStack.isEmpty());
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }

}