import java.util.*;
public class q19 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     boolean val=false;
       int  []arr={3,4,2,5,1};
       Arrays.sort(arr);
       System.out.println("Enter the element you wanna search ");
       int n=sc.nextInt();
       {
for(int i=0;i<arr.length;i++)
{
    if(arr[i]==n)
    {
        val=true;
        break;
    }
    else{
        val=false;
    }

}
if(val==true)
{
    System.out.println("Element found");
}
else
{
    System.out.println("Val not found");
}
System.out.println("Enter the index you wanna access");
try
{
    int index=sc.nextInt();
    System.out.println(arr[index]);
}
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.println("Caught Array Index Out of Bounds Exception");
}
       }


    }
}
