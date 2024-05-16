package data_structures_assignment;
import java.util.LinkedList;
import java.util.Queue;
 class Country
  {
    String name;
    int population;
    public Country(String name, int population) 
    {
        this.name = name;
        this.population = population;
    }
}

class BNode 
    {
    Country info;
    BNode left;
    BNode right;
    public BNode(Country info) 
    {
        this.info = info;
        this.left = null;
        this.right = null;
    }
}
class BST_q3q4 
{
    BNode root;
    public BST_q3q4() {
        this.root = null;
    }
    public void insert(Country Country) {
        root = insertRec(root, Country);
    }

    public BNode insertRec(BNode root, Country Country) {
        if (root == null) 
        {
            root = new BNode(Country);
            return root;
        }
        if (Country.population <= root.info.population) 
        
            root.left = insertRec(root.left, Country);
     else 
        
            root.right = insertRec(root.right, Country);
        
        return root;
    }
     public void levelOrderTraversal() 
     {
        if (root == null) 
        return;
        Queue<BNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            BNode temp = queue.poll();
            System.out.print(temp.info.name + " ");
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
    }
    public BNode findMax() 
    {
        if (root== null) 
        return null;
        BNode current= root;
        while (current.right!= null) 
            current= current.right;
        return current;
    }
    public BNode findMin() 
    {
        if (root == null)
         return null;
        BNode current = root;
        while (current.left != null)
         {
            current = current.left;
        }
        return current;
    }
    public static void main(String[] args) {
        BST_q3q4 bst = new BST_q3q4();
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
        System.out.println("Node with maximum population:");
        BNode maxNode = bst.findMax();
        System.out.println("Name:" +maxNode.info.name+ ",Population: " + maxNode.info.population);
         // Finding node with minimum population
        System.out.println("Node with minimum population:");
        BNode minNode = bst.findMin();
        System.out.println("Name:" + minNode.info.name + ",Population: " + minNode.info.population);
    }
}
