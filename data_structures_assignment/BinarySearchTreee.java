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
public class BinarySearchTreee {
    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) 
            return null;
        
        if (key < root.value) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.value) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.value = minValue(root.right);
            
            // Delete the inorder successor
            root.right = deleteNode(root.right, root.value);
        }
        
        return root;
    }
    
    private static int minValue(TreeNode node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }
    
    public static void main(String[] args) {
        // Example usage:
        // Construct the binary search tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        
        // Delete node with value 3
        root = deleteNode(root, 3);
        
        // Print the inorder traversal of the modified binary search tree
        inorderTraversal(root);
    }
    
    private static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }
}
