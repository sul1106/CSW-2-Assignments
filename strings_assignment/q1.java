package strings_assignment;
import java.util.*;
public class q1
{
    public static void main(String args[])
    {
        String declaration1 = "HEYYY";  //Initializing and declaring a string
        String declaration2 = new String("HEYYY");
        System.out.println("s1==s2? "+ declaration1==declaration2);  //memory comparison
        System.out.println("s1.equals(s2)? "+ declaration1.equals(declaration2));  //content comparison
    }
}