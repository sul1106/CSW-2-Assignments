package oops_assignment;

// Student.java
class Student {
    private int studentId;
    private String studentName;

    // Constructor
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

// Course.java
class Course {
    private int courseId;
    private String courseName;

    // Constructor
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getters
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// EnrollmentSystem.java (Interface for loose coupling)
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollmentDetails();
}

// Enrollment.java
class Enrollment implements EnrollmentSystem {
    private List<Student> enrolledStudents;
    private List<Course> enrolledCourses;

    // Constructor
    public Enrollment() {
        this.enrolledStudents = new ArrayList<>();
        this.enrolledCourses = new ArrayList<>();
    }

    // Methods for enrollment and dropping
    @Override
    public void enrollStudent(Student student, Course course) {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
        System.out.println(student.getStudentName() + " enrolled in " + course.getCourseName() + ".");
    }

    @Override
    public void dropStudent(Student student, Course course) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println(student.getStudentName() + " dropped from " + course.getCourseName() + ".");
        } else {
            System.out.println("Student is not enrolled in this course.");
        }
    }

    // Method to display enrollment details
    @Override
    public void displayEnrollmentDetails() {
        System.out.println("\nEnrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            System.out.println("Student: " + enrolledStudents.get(i).getStudentName() +
                    ", Course: " + enrolledCourses.get(i).getCourseName());
        }
    }
}

// Main.java
public class q9 {
    public static void main(String[] args) {
        // Creating instances
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(102, "Bob");

        Course course1 = new Course(201, "Mathematics");
        Course course2 = new Course(202, "Computer Science");

        EnrollmentSystem enrollmentSystem = new Enrollment();

        // Enrolling students
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);

        // Displaying enrollment details
        enrollmentSystem.displayEnrollmentDetails();

        // Dropping a student
        enrollmentSystem.dropStudent(student2, course2);

        // Displaying updated enrollment details
        enrollmentSystem.displayEnrollmentDetails();
    }
}