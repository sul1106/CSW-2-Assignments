package strings_assignment;
public class q6 {
    public static void main(String[] args) {
        String stringValue1 = "Hello";
        String stringValue2 = "HeLLo";// Creating String 1 and 2 with value
        String stringValue1Lcase=stringValue1.toLowerCase(); //Converting to lower case
        String stringValue1Ucase=stringValue1.toUpperCase(); //Converting to upper case
        String stringValue2Lcase=stringValue2.toLowerCase(); //Converting to lower case
        String stringValue2Ucase=stringValue2.toUpperCase(); //Converting to upper case
        boolean areEqual=stringValue1Lcase.equals(stringValue2Lcase);
        System.out.println("Are they equal? "+ areEqual); //Checking for equality
    }
}