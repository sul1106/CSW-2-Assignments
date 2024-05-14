package gc_assignment;


import java.util.ArrayList;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student " + name + " has been successfully garbage collected.");
    }
}

public class EnrollmentProgram {
    public static void main(String[] args) {
        // Creating a list to hold student objects
        ArrayList<Student> students = new ArrayList<>();

        // Adding some students to the list
        for (int i = 0; i < 10000; i++) {
            students.add(new Student("Student" + i, 20 + i));
        }

        // Utilize the Runtime class to monitor memory usage
        Runtime runtime = Runtime.getRuntime();
        long totalMemoryBefore = runtime.totalMemory();
        System.out.println("Total memory allocated before: " + totalMemoryBefore);

        long freeMemoryBefore = runtime.freeMemory();
        System.out.println("Free memory before: " + freeMemoryBefore);

        // Explicitly invoke garbage collection
        System.gc();

        // Utilize the Runtime class to monitor memory usage after garbage collection
        long totalMemoryAfter = runtime.totalMemory();
        System.out.println("Total memory allocated after GC: " + totalMemoryAfter);

        long freeMemoryAfter = runtime.freeMemory();
        System.out.println("Free memory after GC: " + freeMemoryAfter);
    }
}
