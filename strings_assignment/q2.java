package strings_assignment;
public class q2 
{
    public static void main(String[] args) {
        String partOne="Hello"; //creating string
   String newPart= partOne.concat(" World");
    System.out.println(partOne);
    System.out.println(newPart); //Concatenated String
    CharSequence cs="Immutable";
    System.out.println(cs.charAt(3)); //Using CharAt to find character at specified String 
    }
    
}