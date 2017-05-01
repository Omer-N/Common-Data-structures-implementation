package stack;

/**
 * Represents a node in the stack
 */
public class StackNode<T> {
    private StackNode<T> next;
    private T data;

    public StackNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public StackNode<T> getNext() {
        return next;
    }

    public void setNext(StackNode<T> next) {
        this.next = next;
    }
}
