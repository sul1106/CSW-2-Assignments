package gc_assignment;
public class NullifiedReference {
    String name;
    NullifiedReference(String name)
    {
        this.name=name;
    }
    public static void main(String[] args) {
       NullifiedReference ob=new NullifiedReference("Ob");
    ob=null; 
    System.gc();
    }
    
    
}
