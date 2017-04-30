package trees.binarysearchtree;

/**
 * Binary Search Tree model
 */
public class BinarySearchTree<T extends Comparable<T>> {
    BinSerachNode<T> rootNode;

    /**
     * Initialize new tree with the parameter data in the root
     * @param data
     */
    public BinarySearchTree(T data) {
        rootNode = new BinSerachNode<T>(data);
    }

    /**
     * Insert comparable object to the correct location at the current Binary Search Tree
     * @param toInsert
     */
    public void insert(T toInsert) {
        rootNode.insert(toInsert);
    }

    /**
     * @return The size of the current tree
     */
    public int size() {
        return rootNode.size();
    }


    /**
     * @return The height of the current tree
     */
    public int height() {
        return rootNode.height();
    }

    /**
     * Removing given object from the Binary Search Tree (If exist), keeping it's Binary Search Tree structure
     * @param toRemove
     */
    public void remove(T toRemove) {
        rootNode.remove(toRemove);
    }

    public boolean contains(T toCheck) {
        return rootNode.contains(toCheck);
    }

}
