package generics.generics_pt_2;
import java.util.*;

public class Address {
    int plotno;
    int post;
    Address(int plot,int post)
    {
        plotno=plot;
        this.post=post;
    }
    public static void main(String[] args) {
        TreeMap<String,Address> tmap=new TreeMap<>();
        tmap.put("Sulagna",new Address(30,100));
tmap.put("Aradhay",new Address(105,8000));
Set set=tmap.entrySet();
Iterator itr=set.iterator();
while(itr.hasNext())
{
    Map.Entry ment=(Map.Entry) itr.next();
    System.out.println("Key: "+ ment.getKey()+" Value: "+ ment.getValue());
}
    }

    
}
