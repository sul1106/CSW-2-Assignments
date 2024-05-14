package generics;
class Student<T>
{
    private T rollno;
    private String name;
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public T getRollno() {
        return rollno;
    }
    public void setRollno(T rollno) {
        this.rollno = rollno;
    }

}
public class Driver {
    public static void main(String[] args) {
         Student<String> student=new Student<String>();
student.setRollno("123");
student.setName("Sulagna");
student.setAge(20);
System.out.println("Student details are: ");
System.out.println(student.getAge());
System.out.println(student.getName());
System.out.println(student.getRollno());
Student<Integer> student2= new Student<Integer>();
student2.setRollno(1478965239);
student2.setName("John Doe");
student2.setAge(19);
System.out.println("Student details are: ");
System.out.println(student2.getAge());
System.out.println(student2.getName());
System.out.println(student2.getRollno());

    }
   


}
