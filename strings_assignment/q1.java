package strings_assignment;
import java.util.*;
public class q1
{
    public static void main(String args[])
    {
        String str1="HEYYY";
        String str2=new String("HEYYY");
        //memory comparison
        System.out.println("s1==s2? "+ str1==str2);
        //content comparison
        System.out.println("s1.equals(s2)? "+ str1.equals(str2));


    }
}