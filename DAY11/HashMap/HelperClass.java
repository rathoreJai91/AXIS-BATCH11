package HashMap;

import java.util.HashMap;
import java.util.Scanner;

class HelperClass {
    Scanner s = new Scanner(System.in);
    HashMap<Integer,Student> map = new HashMap<>();

    void addStudent(){
        System.out.println("Enter roll no. :");
        int rollNo = s.nextInt();
        while(map.containsKey(rollNo)){
            System.out.println("Roll no. already present!");
            System.out.println("Enter Roll No. again: ");
            rollNo = s.nextInt();
        }
        Student std = new Student();
        std.rollNo = rollNo;
        System.out.println("Enter Name :");
        std.name = s.next();
        System.out.println("Enter College :");
        std.college = s.next();
        System.out.println("Enter Branch :");
        std.branch = s.next();
        map.put(rollNo , std);
        System.out.println("Student Record added successfully");
    }

    void searchStudent(){
        System.out.println("Enter student roll number :");
        int rollNo = s.nextInt();
        while(!map.containsKey(rollNo)){
            System.out.println("Student Record not Found");
            System.out.println("Enter Roll No. again: ");
            rollNo = s.nextInt();
        }
        Student std = map.get(rollNo);
        // System.out.println("Roll No.-> " + std.rollNo);
        // System.out.println("Name-> " + std.name);
        // System.out.println("College-> " + std.college);
        // System.out.println("Branch-> " + std.branch);
        std.display();
    }

    void deleteStudent(){
        System.out.println("Enter student roll number :");
        int rollNo = s.nextInt();
        while(!map.containsKey(rollNo)){
            System.out.println("Student Record not Found");
            System.out.println("Enter Roll No. again: ");
            rollNo = s.nextInt();
        }
        System.out.println("Deleted Students Record.");
        Student std = map.remove(rollNo);
        std.display();
    }
}
