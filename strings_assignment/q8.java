package strings_assignment;
import java.util.*;
public class q8 {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
System.out.println("Write first String");
String stringValue1=sc.nextLine(); //Taking user input for first string
System.out.println("Enter second string");
String stringValue2=sc.nextLine(); //Taking user input for second string
String newstringValue1=stringValue1.concat(stringValue2);
String newstringValue2=stringValue1+stringValue2; 
System.out.println(newstringValue1);
System.out.println(newstringValue2);
System.out.println("Enter index");
int index=sc.nextInt();
char c=newstringValue1.charAt(index); // finding char at specified index
System.out.println(c);

    }
    
}