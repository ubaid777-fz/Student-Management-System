import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String course;

    Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("-------------------");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                students.add(new Student(id, name, age, course));

                System.out.println("Student added successfully!");

            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    for (Student student : students) {
                        student.display();
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();

                boolean found = false;

                for (Student student : students) {
                    if (student.id == id) {
                        student.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 4) {
                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}