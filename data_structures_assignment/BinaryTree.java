package data_structures_assignment;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    public static boolean isBST(TreeNode root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private static boolean isBSTUtil(TreeNode node, int min, int max) {
        if (node == null)
            return true;
        
        if (node.value <= min || node.value >= max)
            return false;
        
        return isBSTUtil(node.left, min, node.value) && isBSTUtil(node.right, node.value, max);
    }
    
    public static void main(String[] args) {
        // Example usage:
        // Construct the binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        
        // Check if the binary tree is a binary search tree
        System.out.println(isBST(root)); // Output should be true
    }
}
