package lists.linkedlist;

import com.sun.istack.internal.NotNull;
import lists.List;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * List implementation with linked list
 */
public class LinkedList<T> implements List<T> {

    private ListNode<T> firstNode;
    private int _size;

    public LinkedList() {
    }

    /**
     * Insert given object to the end of the list
     * @param toInsert
     */
    @Override
    public void insert(@NotNull T toInsert) {
        if(isEmpty()) {
            firstNode = new ListNode<T>(toInsert);
        } else {
            ListNode<T> current = firstNode;
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(new ListNode<T>(toInsert));
        }
        _size++;
    }

    /**
     * Returns the item stored in the "index" position if exist, throw exception if it's illegal index
     * @param index
     * @return The item stored in the "index" position
     */
    @Override
    public T get(int index) {
        if(size() <= index)
            throw new NoSuchElementException("The required index isn't in the list");
        ListNode<T> current = firstNode;
        while (index > 0) {
            current = current.getNext();
            index--;
        }
        return current.getData();
    }

    /**
     * @return the size of the list
     */
    @Override
    public int size() {
        return _size;
    }

    /**
     * @return Whether the list is empty or not
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Remove given object from the list if exist,
     * If it's exist more then 1 time then it'll be deleted from the first occurrence
     * @param toDelete
     */
    @Override
    public void remove(@NotNull T toDelete) {
        if (size() == 1 && firstNode.getData().equals(toDelete)) {
            firstNode = null;
            _size--;
        } else {
            ListNode<T> current = firstNode;
            ListNode<T> prev = null;
            while (current != null && !current.getData().equals(toDelete)) {
                prev = current;
                current = current.getNext();
            }
            if (current != null && current.getData().equals(toDelete)) {
                if (prev != null) {
                    prev.setNext(current.getNext());
                } else {
                    firstNode = current.getNext();
                }
                _size--;
            }
        }
    }

    /**
     * @param expected Object to find in the list
     * @return Whether the expected object is in the list
     */
    @Override
    public boolean contains(T expected) {
        ListNode<T> current = firstNode;
        while (current != null) {
            if(current.getData().equals(expected))
                return true;
            current = current.getNext();
        }
        return false;
    }

    /**
     * @return Iterator for the list
     */
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(firstNode);
    }
}
