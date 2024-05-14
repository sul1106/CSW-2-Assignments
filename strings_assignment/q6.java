package strings_assignment;



public class q6 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "HeLLo";
        String str1lcase=str1.toLowerCase();
        String str1ucase=str1.toUpperCase();
        String str2lcase=str2.toLowerCase();
        String str2ucase=str2.toUpperCase();
        boolean areEqual=str1lcase.equals(str2lcase);
        System.out.println("Are they equal? "+ areEqual);
    }
}
