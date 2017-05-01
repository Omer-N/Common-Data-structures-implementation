package stack;

import java.util.NoSuchElementException;

/**
 * Created by omernizri on 01/05/2017.
 */
public class Stack<T> {

    private StackNode<T> first;
    private int _size;

    public void insert(T toInsert) {
        if(isEmpty())
            first = new StackNode<T>(toInsert);
        else {
            StackNode<T> temp = first;
            first = new StackNode<T>(toInsert);
            first.setNext(temp);
        }
        increaseSizeByOne();
    }

    public T pop() {
        if(isEmpty())
            throw new NoSuchElementException("Can't pop from empty stack");
        decreaseSizeByOne();
        T output = first.getData();
        first = first.getNext();
        return output;
    }

    public T peek() {
        if(isEmpty())
            throw new NoSuchElementException("Can't peek into empty stack");
        return first.getData();
    }

    public int search(T toSearch) {
        int counter = 0;
        StackNode<T> current = first;
        while (current != null && !current.getData().equals(toSearch)) {
            current = current.getNext();
            counter++;
        }
        if(current != null && current.getData().equals(toSearch))
            return counter;
        return -1;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return _size;
    }

    private void decreaseSizeByOne() {
        _size--;
    }

    private void increaseSizeByOne() {
        _size++;
    }
}
