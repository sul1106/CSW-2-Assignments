
package strings_assignment;
import java.util.*;
public class q4 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println("What do you want to do?");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("What do u wanna add");
            String s1=sc.nextLine();
            System.out.println("Where do you wanna add?");
            int pos=sc.nextInt();
            sb.insert(pos, s1);
            System.out.println(sb);
            break;
            case 2:
            System.out.println("what do u want to remove?");
            int start=sc.nextInt();
            int end=sc.nextInt();
            sb.delete(start, end);
            System.out.println(sb);
            break;
            case 3:
            System.out.println("Where do you want to change and what?");
            String modify=sc.nextLine();
            char modifyc=modify.charAt(0);
            int posmod=sc.nextInt();
            sb.setCharAt(posmod, modifyc);
            System.out.println(sb);
            break;
            case 4:
            System.out.println(" what do u want to concatenate?");
            String concat=sc.nextLine();
            sb.append(concat);
            System.out.println(sb);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
    
}
