import java.util.*;
public class q8 {
    public static void main(String[] args) {
      int x=-3;
    try
    {
        if(x<0)
        {
            throw new ArithmeticException("nahi");
        }
        double sq=Math.sqrt(x);
        System.out.println(sq);
    }
    catch(ArithmeticException e)
    {
System.out.println("Neg value");
    }   
    }
   
}
