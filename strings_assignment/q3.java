package strings_assignment;
public class q3 {
    public static void main(String[] args) {
        StringBuffer stringBuffvalue =new StringBuffer();  // Creating StringBuffer
        stringBuffvalue.append("LALA LAND"); //Adding value to String Buffer
        System.out.println(stringBuffvalue);
        System.out.println(  stringBuffvalue.length()+ " "+   stringBuffvalue.capacity());
          stringBuffvalue.insert(2,"INSERTEDVALUE");  //Inserting function
        System.out.println(  stringBuffvalue);
        System.out.println(  stringBuffvalue.length()+ " "+   stringBuffvalue.capacity());
          stringBuffvalue.delete(2,3 ); //Deleting function
        System.out.println(  stringBuffvalue);
        System.out.println(  stringBuffvalue.length()+ " "+   stringBuffvalue.capacity());
          stringBuffvalue.reverse(); //Reversing function
        System.out.println(  stringBuffvalue);
        System.out.println(  stringBuffvalue.length()+ " "+   stringBuffvalue.capacity());
          stringBuffvalue.replace(1, 4, "REPLACEDVALUE");
        System.out.println(  stringBuffvalue);
        System.out.println(  stringBuffvalue.length()+ " "+   stringBuffvalue.capacity());
    }
}