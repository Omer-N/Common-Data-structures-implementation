package lists.linkedlist;

/**
 * Represents Node at linked list
 */
public class ListNode<T> {
    private T object;
    private ListNode<T> next;

    public ListNode(T object) {
        this.object = object;
    }

    public ListNode(T object, ListNode<T> next) {
        this(object);
        this.next = next;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }
}
