package generics.generics_pt_2;
import java.util.*;
class Student
{
   private String name;
   private int age;
   private int mark;
   Student(String n,int a,int m)
   {
    name=n;
    age=a;
    mark=m;
   }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean equals(Object o)
    {
        if(o instanceof Student)
        {
            Student student=(Student) o;
            return age == student.age &&
                mark == student.mark &&
                name.equals(student.name);
        }
            else
            {
                return false;
            }
        }
    }

public class q4 {
    public static void main(String[] args) {
        LinkedList<Student> ll=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        ll.add(new Student("Sulagna",19,100));
ll.add(new Student("Aradhay",19,100));
ll.add(new Student("Jonaki",23,85));
System.out.println("Select what you want to do: \n1.Display\n2.Print exitence\n3.Remove an element\n4.Count the number of objects");
int n=sc.nextInt();
switch(n)
{
    case 1:
    for(int i=0;i<ll.size();i++)
    {
System.out.println("Name: "+ ll.get(i).getName()+ " Age: "+ ll.get(i).getAge()+ " Mark: "+ll.get(i).getMark());
    }
    break;
    case 2:
    System.out.println("Enter student details to check existence:");
    System.out.print("Name: ");
    String name = sc.next();
    System.out.print("Age: ");
    int age = sc.nextInt();
    System.out.print("Mark: ");
    int mark = sc.nextInt();
    Student searchStudent = new Student(name, age, mark);
    boolean foundByReference = false;
    boolean foundByContain = false;
    for (Student student : ll) {
        if (student == searchStudent) {
            foundByReference = true;
        }
        if (student.equals(searchStudent)) {
            foundByContain = true;
        }
    }
    if (foundByReference) {
        System.out.println("The element is found by reference in the list.");
    } else {
        System.out.println("The element is not found by reference in the list.");
    }
    if (foundByContain) {
        System.out.println("The element is found by contain in the list.");
    } else {
        System.out.println("The element is not found by contain in the list.");
    }
    break;
    case 3:
    System.out.println("Enter index to remove");
    int index=sc.nextInt();
    ll.remove(index);
    break;
    case 4: 
    System.out.println("No of objects in the list: "+ ll.size());
    break;

}
for(int i=0;i<ll.size();i++)
{
    for(int j=i+1;j<ll.size();j++)
    {
System.out.println(ll.get(i).equals(ll.get(j)));
    }
}


    }
}
