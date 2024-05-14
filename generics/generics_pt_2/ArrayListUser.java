package generics.generics_pt_2;
import java.util.*;
class User
{
    private String name;
    private int age;
    public User(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
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
}
public class ArrayListUser {
    public void sortUsersByAge(ArrayList<User> userList) {
    Collections.sort(userList, new Comparator<User>() {
        @Override
        public int compare(User user1, User user2) {
            return Integer.compare(user1.getAge(), user2.getAge());
        }
    });
}
    public static void main(String[] args) {
        // 1. Create an object of the generic class with a specific type parameter (User).
        ArrayList<User> userList = new ArrayList<>();
        
        // 2. Add elements to that list using the add method provided by the ArrayList class.
        userList.add(new User("Alice",100));
        userList.add(new User("Bob",56));
        System.out.println("After adding two users: ");      
        for(int i=0;i<userList.size();i++)
        {
            System.out.println(userList.get(i).getName()+" "+  userList.get(i).getAge());
        }
        System.out.println("\nSorted List in Ascending Order By Age");    
        ArrayListUser u = new ArrayListUser();
        u.sortUsersByAge(userList);  
        for(int i=0;i<userList.size();i++)
        {
            System.out.println(userList.get(i).getName() +" "+ userList.get(i).getAge());
        }
      
    }
}
