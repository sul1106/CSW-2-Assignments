package gc_assignment; 
public class gc {
    private String name;
    public gc(String name)
    {
        this.name=name;
    }
    public void show()
    {
        gc ob=new gc("ob1");
        display();
    }
    public void display()
    {
        gc ob=new gc("ob2");
        System.out.println("Name of an object"+ob.name);
    }
    public static void main(String[] args) {
        gc ob=new gc("main object");
        ob.show();
        System.gc();
    }
    public  void finalize() 
    {
        System.out.println("Finalizing the object "+this.name);
}
}

