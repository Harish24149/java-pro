import java.util.ArrayList;
import java.util.Scanner;

// Model for Student
class Student {
    private String name;
    private int id;
    private String grade;

    public Student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Grade: " + grade);
    }
}

// Model for Teacher
class Teacher {
    private String name;
    private int id;
    private String subject;

    public Teacher(String name, int id, String subject) {
        this.name = name;
        this.id = id;
        this.subject = subject;
    }

    public void displayInfo() {
        System.out.println("Teacher ID: " + id + ", Name: " + name + ", Subject: " + subject);
    }
}

// School Management System
public class SchoolManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== School Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display Students");
            System.out.println("4. Display Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    displayTeachers();
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private static void addStudent() {
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Student Grade: ");
        String grade = scanner.nextLine();

        students.add(new Student(name, id, grade));
        System.out.println("Student added successfully!");
    }

    private static void addTeacher() {
        System.out.print("Enter Teacher Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Teacher ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();

        teachers.add(new Teacher(name, id, subject));
        System.out.println("Teacher added successfully!");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\nList of Students:");
            for (Student s : students) {
                s.displayInfo();
            }
        }
    }

    private static void displayTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers to display.");
        } else {
            System.out.println("\nList of Teachers:");
            for (Teacher t : teachers) {
                t.displayInfo();
            }
        }
    }
}
