package gc_assignment;

public class lotofobjects {
    String name;
    int roll;
    lotofobjects(String n,int r)
    {
name=n;
roll=r;
    }
    public static void main(String[] args) {
        lotofobjects ob1=new lotofobjects("ob1", 1);
        System.out.println(System.currentTimeMillis()+ "Heap size "+ Runtime.getRuntime().totalMemory());
        lotofobjects ob2=new lotofobjects("ob2", 2);
        System.out.println(System.currentTimeMillis()+ "Heap size "+ Runtime.getRuntime().totalMemory());
        lotofobjects ob3=new lotofobjects("ob3", 3);
        System.out.println(System.currentTimeMillis()+ "Heap size "+ Runtime.getRuntime().totalMemory());
        lotofobjects ob4=new lotofobjects("ob4",4);
        System.out.println(System.currentTimeMillis()+ "Heap size "+ Runtime.getRuntime().totalMemory());
        lotofobjects ob5=new lotofobjects("ob5", 5);
        System.out.println(System.currentTimeMillis()+ "Heap size "+ Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());
        System.gc();
        System.out.println(Runtime.getRuntime().freeMemory());


    }
    
}
