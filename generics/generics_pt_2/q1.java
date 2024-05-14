package generics.generics_pt_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

class Pair<K,V>
{
    private K key;
    private V value;
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public void setValue(V value) {
        this.value = value;
    }
    Pair(K k,V v)
    {
this.key=k;
this.value=v;
    }
}
public class q1 {
    public static void main(String[] args) {
        HashMap hmap=new HashMap<>();
        //Adding elements to the map using object of Pair class
        Pair p1=new Pair("John",35);
        Pair p2=new Pair("Jane",40);
        hmap.put(p1.getKey(),p1.getValue());
        hmap.put(p2.getKey(),p2.getValue());
Set set=hmap.entrySet();
Iterator iterator=set.iterator();
while(iterator.hasNext())
{
  Map.Entry ment= (Map.Entry)iterator.next();
  System.out.println("The key is: "+ ment.getKey()+ " The value is : "+ ment.getValue());
}
    }
}
