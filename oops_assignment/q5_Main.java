package oops_assignment;

class College {
    String collegeName;
    String collegeLoc;
}

class Student {
    int studentId;
    String studentName;
    College myCollege = new College();

    // Constructor to initialize student ID, name, and college information
    Student(int sid, String sname, College college) {
        this.studentId = sid;
        this.studentName = sname;
        this.myCollege = college;
    }

    // Method to display student information
    void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + myCollege.collegeName);
        System.out.println("College Location: " + myCollege.collegeLoc);
        System.out.println();
    }
}

public class q5_Main {
    public static void main(String[] args) {
        // Instantiate College objects
        College college1 = new College();
        college1.collegeName = "XYZ University";
        college1.collegeLoc = "New York";

        College college2 = new College();
        college2.collegeName = "ABC College";
        college2.collegeLoc = "Los Angeles";

        // Instantiate Student objects and enroll them in colleges
        Student student1 = new Student(1, "John", college1);
        Student student2 = new Student(2, "Emma", college2);

        // Display information of all colleges
        System.out.println("College Information:");
        System.out.println("College 1: " + college1.collegeName + ", Location: " + college1.collegeLoc);
        System.out.println("College 2: " + college2.collegeName + ", Location: " + college2.collegeLoc);
        System.out.println();

        // Display information of all students
        System.out.println("Student Information:");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
