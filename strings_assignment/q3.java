package strings_assignment;

public class q3 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("LALA LAND");
        System.out.println(sb);
        System.out.println(sb.length()+ " "+ sb.capacity());
        sb.insert(2,"SLAYYY");
        System.out.println(sb);
        System.out.println(sb.length()+ " "+ sb.capacity());
        sb.delete(2,3 );
        System.out.println(sb);
        System.out.println(sb.length()+ " "+ sb.capacity());
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length()+ " "+ sb.capacity());
        sb.replace(1, 4, "dumbassssssssssssssssssssssssssssssssssssssssssss");
        System.out.println(sb);
        System.out.println(sb.length()+ " "+ sb.capacity());
    }
}
