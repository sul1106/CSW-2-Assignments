package strings_assignment;

public class q7 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        char[] chararray=str1.toCharArray();
        char ch='H';
        int firstIndex = str1.indexOf(ch);
        int lastIndex = str1.lastIndexOf(ch);
        for( char c:chararray){
            System.out.print(c+ " ");
    }
    System.out.println("\nFirst occurrence of '" + ch + "': " + firstIndex);
    System.out.println("Last occurrence of '" + ch + "': " + lastIndex);
}
}
