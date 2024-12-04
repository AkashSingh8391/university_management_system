package myPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----- University Management System -----");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Add Faculty");
            System.out.println("4. List Faculty");
            System.out.println("5. Add Course");
            System.out.println("6. List Courses");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    sc.nextLine(); // Consume newline
                    String studentName = sc.nextLine();
                    System.out.print("Enter Student Email: ");
                    String studentEmail = sc.next();
                    System.out.print("Enter Course ID: ");
                    int courseId = sc.nextInt();
                    operations.addStudent(studentName, studentEmail, courseId);
                    break;

                case 2:
                    operations.listStudents();
                    break;

                case 3:
                    System.out.print("Enter Faculty Name: ");
                    sc.nextLine(); // Consume newline
                    String facultyName = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();
                    operations.addFaculty(facultyName, department);
                    break;

                case 4:
                    operations.listFaculty();
                    break;

                case 5:
                    System.out.print("Enter Course Name: ");
                    sc.nextLine(); // Consume newline
                    String courseName = sc.nextLine();
                    System.out.print("Enter Course Credits: ");
                    int credits = sc.nextInt();
                    operations.addCourse(courseName, credits);
                    break;

                case 6:
                    operations.listCourses();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
