import java.util.*;
class CustomCheckedException extends Exception{
    public CustomCheckedException(String message)
{
    super(message);
}
}
public class q22 {
    
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try
        {
            int a=sc.nextInt();
            if(a<0)
            {
                throw new CustomCheckedException("Input is negative");
            }
        }
        catch(CustomCheckedException e)
        {
            System.out.println("Caught ya lol");
        }
    }
}
