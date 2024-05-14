import java.util.*;
class NegativeValueException extends Exception
{
    public NegativeValueException(String message)
    {
        super(message);
    }
}

public class q14 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double x =sc.nextDouble();
    try{
       double sin=Math.sin(x);
double cos=Math.cos(x);
double tan=Math.tan(x);
double cot=1/tan;
double abs=Math.abs(sin+cos) ;
if(abs<0)
{
    throw new NegativeValueException("Neg value hai");
}
double num=Math.log(abs);

double den=tan-cot;
double res=num/den;
System.out.println(res);

    }
    catch(ArithmeticException e )
    {
        System.out.println("Galat hai bhai sab galat");
    }
    catch(NegativeValueException e)
    {
        System.out.println("nahi chalega");
    }

}
}
