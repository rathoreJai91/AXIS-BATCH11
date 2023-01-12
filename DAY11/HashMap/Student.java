package HashMap;

public class Student {
    String name;
    int rollNo;
    String college;
    String branch;
    // public Student(String name, String rollNo, String college, String branch) {
    //     this.name = name;
    //     this.rollNo = rollNo;
    //     this.college = college;
    //     this.branch = branch;
    // }

    void display() {
        System.out.println("Student Name-> "+this.name);
        System.out.println("Student roll No.-> "+this.rollNo);
        System.out.println("Student College-> "+this.college);
        System.out.println("Student Branch-> "+this.branch);
    }
}