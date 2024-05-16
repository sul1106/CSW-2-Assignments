package strings_assignment;
import java.util.*;
public class q4 {
    public static void main(String[] args) {
        StringBuilder stringBuffvalue= new StringBuilder();
        System.out.println("What do you want to do?");
        Scanner sc=new Scanner(System.in);
        int numChoice=sc.nextInt();  //Insert choice for case
        switch(numChoice)
        {
            case 1:
            System.out.println("What do u wanna add");
            String stringValue1=sc.nextLine(); //inserting String to be inserted
            System.out.println("Where do you wanna add?");
            int valuePostion=sc.nextInt(); //Inserting spot to be inserted
            stringBuffvalue.insert(valuePostion, stringValue1);
            System.out.println(stringBuffvalue);
            break;
            case 2:
            System.out.println("what do u want to remove?");
            int start=sc.nextInt(); //starting index of string
            int end=sc.nextInt();
            stringBuffvalue.delete(start, end);
            System.out.println(stringBuffvalue);
            break;
            case 3:
            System.out.println("Where do you want to change and what?");//Insert character to be modified
            String modify=sc.nextLine();
            char modifyCharacter=modify.charAt(0); 
            int valuePostionmod=sc.nextInt();
            stringBuffvalue.setCharAt(valuePostionmod, modifyCharacter);
            System.out.println(stringBuffvalue);
            break;
            case 4:
            System.out.println(" what do u want to concatenate?"); //Insert value to be concatenated
            String concat=sc.nextLine();
            stringBuffvalue.append(concat);
            System.out.println(stringBuffvalue);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
    
}