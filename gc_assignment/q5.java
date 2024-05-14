package gc_assignment;

public class q5 {
    private int roll;
    private double mark;
    public int getRoll()
    {
        return roll;
    }
    public void setRoll(int r)
    {
        roll=r;
    }
    public double getMark()
    {
        return mark;
    }
    public void setMark(double m)
    {
        mark=m;
    }
    public static void makeUnreachable(q5 ob1,q5 ob2)
    {
        ob1=null;
        ob2=null;
    }
    public static void main(String[] args) {
        q5 s1=new q5();
        q5 s2=new q5();
        s1.setMark(90.76);
        s1.setRoll(13);
        s2.setMark(93.2);
        s2.setRoll(45);
       Runtime runtime= Runtime.getRuntime();
       System.out.println("Total memory occupied before:");
       long membef=runtime.totalMemory();
       System.out.println(membef);
       System.out.println("Memory occupied by objects before:");
       long membefobj=membef-runtime.freeMemory();
System.out.println(membefobj);
System.gc();
q5.makeUnreachable(s1, s2);
System.out.println("Total memory occupied after:");
long memaft=runtime.totalMemory();
System.out.println(memaft);
System.out.println("Memory occupied by object after:");
long memaftobj=memaft-runtime.freeMemory();
System.out.println(memaftobj);




    }
}
