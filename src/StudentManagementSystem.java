import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void update(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println("-------------------------");
    }
}

public class StudentManagementSystem {
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> {
                    System.out.println("Thank you for using Student Management System!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
    }

    private static void addStudent() {
        int id = readInt("Enter Student ID: ");

        if (findStudent(id) != null) {
            System.out.println("A student with this ID already exists.");
            return;
        }

        String name = readText("Enter Student Name: ");
        int age = readInt("Enter Age: ");
        String course = readText("Enter Course: ");

        students.add(new Student(id, name, age, course));
        System.out.println("Student added successfully.");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== Student Records =====");
        for (Student student : students) {
            student.display();
        }
    }

    private static void searchStudent() {
        int id = readInt("Enter Student ID: ");
        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println("\nStudent found:");
            student.display();
        }
    }

    private static void updateStudent() {
        int id = readInt("Enter Student ID to update: ");
        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        String name = readText("Enter new name: ");
        int age = readInt("Enter new age: ");
        String course = readText("Enter new course: ");

        student.update(name, age, course);
        System.out.println("Student updated successfully.");
    }

    private static void deleteStudent() {
        int id = readInt("Enter Student ID to delete: ");
        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        students.remove(student);
        System.out.println("Student deleted successfully.");
    }

    private static Student findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static String readText(String message) {
        while (true) {
            System.out.print(message);
            String value = scanner.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println("This field cannot be empty.");
        }
    }
}
