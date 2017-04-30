package lists.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by omernizri on 30/04/2017.
 */
public class LinkedListIterator<T> implements Iterator<T> {
    private ListNode<T> current;

    public LinkedListIterator(ListNode<T> first) {
        this.current = first;
    }

    @Override
    public boolean hasNext() {
        return current.getNext() != null;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();
        T result = current.getData();
        current = current.getNext();
        return result;
    }
}
