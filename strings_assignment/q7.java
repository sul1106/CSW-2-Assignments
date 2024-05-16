package strings_assignment;

public class q7 {
    public static void main(String[] args) {
        String stringValue1 = "Hello World"; //Creating string with value
        char[] chararray=stringValue1.toCharArray();
        char charValue='H'; //Creating character with value
        int firstIndex = stringValue1.indexOf(charValue);
        int lastIndex = stringValue1.lastIndexOf(charValue);
        for( char c:chararray){
            System.out.print(c+ " ");
    }
    System.out.println("\nFirst occurrence of '" + charValue + "': " + firstIndex); //printing first occurance
    System.out.println("Last occurrence of '" + charValue + "': " + lastIndex); //Printing last occurance
}  
}