import java.util.*;
public class q17 {
    public static void main(String[] args) {
        int size=5;
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList();
        for(int i=0;i<size;i++)
        {
            list.add(i);
        }
        System.out.println("enter index you wanna access");
        int index=sc.nextInt();
        try{
             list.get(index);
        }
       catch(IndexOutOfBoundsException e)
       {
System.out.println("bruh");
       }


    }
}
