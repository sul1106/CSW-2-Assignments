package data_structures_assignment;

// Define a TreeNode class for the binary search tree
class TreeNode 
{
    int data; // Value of the node
    TreeNode left; // Reference to the left child
    TreeNode right; // Reference to the right child
    // Constructor to initialize the node with a given value
    public TreeNode(int value)
     {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

// Define a BinarySearchTree class for performing operations on a binary search tree
public class BinarySearchTree_q6 
{
    // Method to delete a node with a given key from the binary search tree
    public static TreeNode deleteNode(TreeNode root, int key) 
    {
        // Base case: If the root is null, return null
        if (root == null)
            return null;
// If the key is less than the value at the root, recursively delete from the left subtree
        if (key < root.data) 
            root.left = deleteNode(root.left, key);
        // If the key is greater than the value at the root, recursively delete from the right subtree
        else if (key > root.data)
            root.right = deleteNode(root.right, key);
        // If the key is found at the root
        else 
        {
            // Case 1: Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 2: Node with two children
            // Get the inorder successor (smallest in the right subtree)
            root.data = findMin(root.right);
            // Delete the inorder successor from the right subtree
            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }
    // Method to find the minimum value in a subtree rooted at a given node
    private static int findMin(TreeNode node)
     {
        int min = node.data;
        while (node.left != null) {
            min = node.left.data;
            node = node.left;
        }
        return min;
    }
    // Main method to demonstrate the usage of the binary search tree operations
    public static void main(String[] args) 
    {
        // Construct the binary search tree
        TreeNode root = new TreeNode(25);
        root.left = new TreeNode(21);
        root.right = new TreeNode(29);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(23);
        root.right.left = new TreeNode(22);
        root.right.right = new TreeNode(28);

        // Delete node with value 3
        root = deleteNode(root, 23);

        // Print the inorder traversal of the modified binary search tree
        inorderTraversal(root);
    }

    // Method to perform an inorder traversal of the binary search tree
    private static void inorderTraversal(TreeNode root) 
    {
        if (root!= null) 
        {
            inorderTraversal(root.left);
            System.out.print(root.data+" ");
            inorderTraversal(root.right);
        }
    }
}
