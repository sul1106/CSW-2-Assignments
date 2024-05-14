package generics.generics_pt_2;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

class Book
{
    int id;
    String name;
    String author;
    int qty;
    public Book(int i,String n,String a,int q)
    {
        id=i;
        name =n;
        author =a;
        qty=q;
    }
}
public class Library {
    public static void main(String[] args) {
        HashMap<Integer,Book> hmap=new HashMap<>();
  Book b1=new Book(101,"Fourth Wing", "Rebecca Yarros",500);
  Book b2=new Book(102,"Iron Flame", "Rebecca Yarros",600);
  hmap.put(b1.id,b1);
  hmap.put(b2.id,b2);
  Set set=hmap.entrySet();
  Iterator itr=set.iterator();
  while (itr.hasNext()) {
    Map.Entry ment= (Map.Entry)itr.next();
    System.out.println(ment.getKey()+" "+ ment.getValue());
    
  }
  //Check if a particular book name is present in the map 
String searchBookName = "Fourth Wing"; // The name of the book you want to check
boolean checkName = false;
for (Book book : hmap.values()) {
    if (book.name.equals(searchBookName)) {
        checkName = true;
        break;
    }
}
System.out.println("Is '" + searchBookName + "' available? " + checkName);

int key=101;
hmap.remove(101);
while (itr.hasNext()) {
    Map.Entry ment= (Map.Entry)itr.next();
    System.out.println(ment.getKey()+" "+ ment.getValue());
    
  }
    }
    
}
