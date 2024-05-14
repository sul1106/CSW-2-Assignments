package strings_assignment;
import java.util.*;

public class q8 {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
System.out.println("Write first String");
String str1=sc.nextLine();
System.out.println("Enter second string");
String str2=sc.nextLine();
String newstr1=str1.concat(str2);
String newstr2=str1+str2;
System.out.println(newstr1);
System.out.println(newstr2);
System.out.println("Enter index");
int n=sc.nextInt();
char c=newstr1.charAt(n);
System.out.println(c);

    }
    
}
