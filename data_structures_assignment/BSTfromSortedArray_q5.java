package data_structures_assignment;
class BNode {
    int info;
    BNode left;
    BNode right;
    public BNode(int info) 
    {
        this.info= info;
        this.left= null;
        this.right= null;
    }
}
public class BSTfromSortedArray_q5 
{
    BNode root;
    public BNode createTree(int[] sortedArray) 
    {
        return createTreeRec(sortedArray, 0, sortedArray.length - 1);
    }
    private BNode createTreeRec(int[] sortedArray, int start, int end) {
        if (start>end) 
            return null;
        int mid= (start + end) / 2;
        BNode node= new BNode(sortedArray[mid]);
        node.left = createTreeRec(sortedArray, start, mid - 1);
        node.right = createTreeRec(sortedArray, mid + 1, end);
        return node;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
         BSTfromSortedArray_q5 bst = new BSTfromSortedArray_q5();
        bst.root = bst.createTree(arr);
    }
}
