package generics.generics_pt_2;
import java.util.ArrayList;
import java.util.Collections;

class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
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

    @Override
    public int compareTo(User user) {
        return Integer.compare(this.age, user.age);
    }
}

public class q2 {
    public static void main(String[] args) {
        User u1 = new User("John", 35);
        User u2 = new User("Alice", 20);
        ArrayList<User> arrayListUser = new ArrayList<>();
        arrayListUser.add(u1);
        arrayListUser.add(u2);
        
        System.out.println("Before sorting:");
        for (User user : arrayListUser) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
        
        Collections.sort(arrayListUser);
        
        System.out.println("\nAfter sorting:");
        for (User user : arrayListUser) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}
