package strings_assignment;
public class q5 {
    public static void main(String[] args) {
        final int iterationNumberS = 1000000; //creating number of iterations 
        String baseString = "Hello";
        long startTime=System.currentTimeMillis();
        StringBuilder stringBuilderValue=new StringBuilder();
        for(int i=0;i<iterationNumberS;i++){
            stringBuilderValue.append(baseString);
        }
        long endTime=System.currentTimeMillis(); //setting end time using system time
        System.out.println("Time taken by stringbuilder: "+ (endTime-startTime)+"The length of the string is"+ stringBuilderValue.length() );
            startTime=System.currentTimeMillis();
            StringBuffer stringBuilderValue2=new StringBuffer();
            for(int i=0;i<iterationNumberS;i++)
            {
                stringBuilderValue2.append(baseString);
            }
            endTime=System.currentTimeMillis();
            System.out.println("The time taken by string buffer is"+ (endTime-startTime)+ "The length of the string is "+ stringBuilderValue2.length());  // displaying time taken by String Builder
    }
}