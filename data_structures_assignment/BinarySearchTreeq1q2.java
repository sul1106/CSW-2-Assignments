package data_structures_assignment;

public class BinarySearchTreeq1q2 {
    static class BSTNode {
        int info;
        BSTNode left;
        BSTNode right;
        public BSTNode(int info)
        {
            this.info = info;
            this.left = null;
            this.right = null;
        }
        public void insert(int value)
        {
            if (value <= info)
             {
                if (left == null) 
                    left = new BSTNode(value);
             else 
                    left.insert(value);
                
              } 
              else {
                if (right == null) 
                    right = new BSTNode(value);
         else 
                    right.insert(value);
                
            }
        }
    }

    // Pre-order traversal
    static void preOrderTraversal(BSTNode node) {
        if (node != null) {
            System.out.print(node.info + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // In-order traversal
    static void inOrderTraversal(BSTNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.info + " ");
            inOrderTraversal(node.right);
        }
    }

    // Post-order traversal
    static void postOrderTraversal(BSTNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.info + " ");
        }
    }

    public static void main(String[] args) {
        // Create a root node
        BSTNode root = new BSTNode(10);

        // Insert nodes
        root.insert(5);
        root.insert(15);
        root.insert(3);
        root.insert(7);

        System.out.println("Pre-order traversal:");
        preOrderTraversal(root);
        System.out.println("\nIn-order traversal:");
        inOrderTraversal(root);
        System.out.println("\nPost-order traversal:");
        postOrderTraversal(root);
    }
}
