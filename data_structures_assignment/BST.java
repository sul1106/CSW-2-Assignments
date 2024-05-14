package data_structures_assignment;
import java.util.LinkedList;
import java.util.Queue;
 class Country {
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
}

class BNode {
    Country info;
    BNode left;
    BNode right;

    public BNode(Country info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }
}
class BST {
    BNode root;

    public BST() {
        this.root = null;
    }

    public void insert(Country country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode root, Country country) {
        if (root == null) {
            root = new BNode(country);
            return root;
        }
        if (country.population <= root.info.population) {
            root.left = insertRec(root.left, country);
        } else {
            root.right = insertRec(root.right, country);
        }
        return root;
    }

    public void levelOrderTraversal() {
        if (root == null) return;

        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BNode tempNode = queue.poll();
            System.out.print(tempNode.info.name + " ");
            if (tempNode.left != null) queue.add(tempNode.left);
            if (tempNode.right != null) queue.add(tempNode.right);
        }
    }

    public BNode findMax() {
        if (root == null) return null;
        BNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    public BNode findMin() {
        if (root == null) return null;
        BNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public static void main(String[] args) {
        BST bst = new BST();

        // Inserting countries
        bst.insert(new Country("USA", 328_200_000));
        bst.insert(new Country("China", 1_394_015_977));
        bst.insert(new Country("India", 1_366_417_754));
        bst.insert(new Country("Brazil", 211_049_527));
        bst.insert(new Country("Pakistan", 216_565_318));

        // Level order traversal
        System.out.println("Level Order Traversal:");
        bst.levelOrderTraversal();

        // Finding node with maximum population
        System.out.println("\nNode with maximum population:");
        BNode maxNode = bst.findMax();
        System.out.println("Name: " + maxNode.info.name + ", Population: " + maxNode.info.population);

        // Finding node with minimum population
        System.out.println("Node with minimum population:");
        BNode minNode = bst.findMin();
        System.out.println("Name: " + minNode.info.name + ", Population: " + minNode.info.population);
    }
}
