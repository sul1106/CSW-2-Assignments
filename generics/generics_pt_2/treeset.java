package generics.generics_pt_2;
import java.util.*;
public class treeset {
    public static void main(String[] args) {
       TreeSet<Integer> tset=new TreeSet<>();
    tset.add(1);
    tset.add(2);
    tset.add(3);
    tset.add(4); 
    System.out.println(tset);
    System.out.println("Enter the number you want to search");
  Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //searching an element in treeset
  
        if(tset.contains(n))
        {
            System.out.println("Element is present in tree set");
        }
        else
        {
            System.out.println("Element not found");
        }
    
    //removing elements from treeset
    System.out.println("Which element do you want to remove? ");
    int m=sc.nextInt();
    tset.remove(m);
    System.out.println("After removing");
    System.out.println(tset);
    }
    
    
}
