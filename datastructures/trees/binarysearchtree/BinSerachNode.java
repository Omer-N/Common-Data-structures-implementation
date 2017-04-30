package trees.binarysearchtree;

/**
 * Represents node in binary search tree
 */
public class BinSerachNode<T extends Comparable<T>> {

    private T data;
    private BinSerachNode<T> leftNode;
    private BinSerachNode<T> rightNode;

    public BinSerachNode(T data) {
        this.data = data;
    }

    /**
     * Insert a given parameter to the BST rooted at this node
     * @param toInsert
     */
    public void insert(T toInsert) {
        if(toInsert.compareTo(data) > 0) {
            if(hasRight())
                getRightNode().insert(toInsert);
            else
                rightNode = new BinSerachNode<T>(toInsert);
        } else {
            if(hasLeft())
                getLeftNode().insert(toInsert);
            else
                leftNode = new BinSerachNode<T>(toInsert);
        }
    }

    /**
     * @return The size of the tree rooted at this node
     */
    public int size() {
        int output = 1;
        if(hasLeft())
            output += getLeftNode().size();
        if(hasRight())
            output += getRightNode().size();
        return output;
    }

    /**
     * @return The height of the tree rooted at this node
     */
    public int height() {
        int left = 0, right = 0;
        if(hasRight())
            right = 1 + getRightNode().height();
        if(hasLeft())
            left = 1 + getLeftNode().height();
        return Math.max(right, left);
    }

    /**
     * Removing given value from the tree
     * @param toRemove
     * @return The root of the tree after removing the value
     */
    public BinSerachNode<T> remove(T toRemove) {
        int compareResult = toRemove.compareTo(data);
        if(compareResult > 0 & hasRight())
            setRightNode(getRightNode().remove(toRemove));
        else if(compareResult < 0 & hasLeft())
            setLeftNode(getLeftNode().remove(toRemove));
        else if (compareResult == 0) {
            if(!hasLeft() | !hasRight()) {
                if (hasLeft())
                    return getLeftNode();
                else
                    return getRightNode();
            }
            else {
                T minimum = findMin();
                setData(minimum);
                rightNode.remove(minimum);
            }
        }

        return this;
    }

    /**
     * @param toCheck
     * @return True IFF toCheck is in the tree rooted by this node
     */
    public boolean contains(T toCheck) {
        int compareResult = toCheck.compareTo(data);
        if(compareResult == 0)
            return true;
        boolean output = false;
        if(hasLeft() & compareResult < 0)
            output = output | getLeftNode().contains(toCheck);
        if(hasRight() & compareResult > 0)
            output = output | getRightNode().contains(toCheck);
        return output;
    }

    /**
     * @return The minimum in the tree rooted in this node
     */
    private T findMin() {
        BinSerachNode<T> current = this;
        while (current.hasLeft())
            current = current.getLeftNode();
        return current.getData();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinSerachNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinSerachNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinSerachNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinSerachNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    private boolean hasLeft() {
        return getLeftNode() != null;
    }

    private boolean hasRight() {
        return getRightNode() != null;
    }
}
