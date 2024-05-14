import java.util.*;
public class q15 {
    public static void main(String[] args) {
        String [] inputString={"123","lmao","321"};
        try
        {
            for(int i=0;i<inputString.length;i++)
            {
                Integer num=Integer.parseInt(inputString[i]);
                 try
            {
                for(int j=0;j<inputString.length;j++)
                {
int result=100/num;
                }
            }
            catch(ArithmeticException e)
            {
                System.out.println("Division by zerooo");
            }
            }
           
        }
        catch(NumberFormatException e)
        {
            System.out.println("Bhai theek se dekh ke kar");
        }
       
    }
}
