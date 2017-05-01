package lists;

/**
 * List basic operations
 */
public interface List<T> extends Iterable<T> {
    /**
     * Insert given object to the list
     *
     * @param toInsert
     */
    void insert(T toInsert);

    /**
     * @param i
     * @return Returns the object at location i
     */
    T get(int i);

    int size();

    /**
     * @return Whether the list is empty or not
     */
    boolean isEmpty();

    /**
     * Delete a given object from the list if it's there (delete the first location of it's instance in the list)
     *
     * @param toDelete
     */
    void remove(T toDelete);

    /**
     * @param expected Object to find in the list
     * @return True iff "expected" is in the list
     */
    boolean contains(T expected);
}
