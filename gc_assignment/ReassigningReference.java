package gc_assignment;
public class ReassigningReference {
    String name;
    ReassigningReference(String name)
    {
        this.name=name;
    }
    protected void finalize() throws Throwable {
        System.out.println(name + " has been successfully garbage collected.");
    }
    public static void main(String[] args) {
       ReassigningReference ob1=new ReassigningReference("obj1");
ReassigningReference ob2=new ReassigningReference("ob2");
ob1=ob2;
System.gc(); 
    }

}
