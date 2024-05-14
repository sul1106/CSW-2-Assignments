package gc_assignment;

public class AnonymousObject {
    String name;
    AnonymousObject(String name)
    {
this.name=name;
    }
    protected void finalize ()throws Throwable{
        System.out.println("Finalize called for "+name);
    }
    public static void main(String[] args) {
        //Anonymous Object 1
      new AnonymousObject("HEY");
      System.gc();
    }
}
