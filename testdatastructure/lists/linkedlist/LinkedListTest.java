package lists.linkedlist.tests;

import lists.List;
import lists.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by omernizri on 30/04/2017.
 */
class LinkedListTest {
    @Test
    void insert() {
        List<String> stringList = new LinkedList<>();
        stringList.insert("1");
        stringList.insert("2");
        stringList.insert("3");

        assertEquals("1", stringList.get(0));
    }

    @Test
    void get() {
        List<String> stringList = new LinkedList<>();
        try {
            stringList.get(0);
            fail("Should throw exception");
        } catch (Exception e) {

        }

        stringList.insert("abd");
        stringList.insert("secondString");
        assertEquals("abd", stringList.get(0));
        assertEquals("secondString", stringList.get(1));
    }

    @Test
    void size() {
        List<String> stringList = new LinkedList<>();
        assertEquals(0, stringList.size());
        stringList.insert("abcd");
        stringList.insert("abcd");
        stringList.insert("abcd");
        assertEquals(3, stringList.size());
    }

    @Test
    void isEmpty() {
        List<String> stringList = new LinkedList<>();
        assertTrue(stringList.isEmpty());

        stringList.insert("abcd");
        assertFalse(stringList.isEmpty());

        stringList.remove("abcd");
        assertTrue(stringList.isEmpty());
    }

    @Test
    void remove() {
        List<String> stringList = new LinkedList<>();
        assertTrue(stringList.isEmpty());

        stringList.insert("abcd");
        assertFalse(stringList.isEmpty());

        stringList.remove("abcd");
        assertTrue(stringList.isEmpty());

        stringList.insert("abcd");
        stringList.insert("secondstring");
        assertEquals(2, stringList.size());
        stringList.remove("abcd");
        assertEquals(stringList.get(0), "secondstring");
        assertEquals(1, stringList.size());

        stringList.insert("abcd");
        stringList.remove("secondstring");
        assertEquals(stringList.get(0), "abcd");

        stringList = new LinkedList<>();
        try {
            stringList.remove("");
            stringList.insert("kaksdasd");
            stringList.remove("abcd");
        } catch (Exception e) {
            fail("It should do nothing if it's not in the list");
        }
    }

    @Test
    void contains() {
        List<String> list = new LinkedList<>();
        assertFalse(list.contains("123"));

        list.insert("abcd");
        list.insert("1234");
        list.insert("$");
        assertTrue(list.contains("$"));
        assertTrue(list.contains("1234"));
        assertTrue(list.contains("abcd"));
        assertFalse(list.contains("0"));
    }

}