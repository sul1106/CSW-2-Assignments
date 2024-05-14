package strings_assignment;

public class q5 {
    public static void main(String[] args) {
        final int ITERATIONS = 1000000;
        String baseString = "Hello";
        long starttime=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ITERATIONS;i++){
            sb.append(baseString);
        }
        long endtime=System.currentTimeMillis();
        System.out.println("Time taken by stringbuilder: "+ (endtime-starttime)+"The length of the string is"+ sb.length() );
            starttime=System.currentTimeMillis();
            StringBuffer sb2=new StringBuffer();
            for(int i=0;i<ITERATIONS;i++)
            {
                sb2.append(baseString);
            }
            endtime=System.currentTimeMillis();
            System.out.println("The time taken by string buffer is"+ (endtime-starttime)+ "The length of the string is "+ sb2.length());
    }
}
