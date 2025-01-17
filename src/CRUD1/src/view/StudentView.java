package view;

import controller.StudentController;
import model.Student;

import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();

    public void displayMenu() {
        final int DISPLAY = 1;
        final int ADD = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int SEARCH = 5;
        final int EXIT = 6;
        while (true) {
            System.out.println("---Menu---" +
                    "\n 1. Display" +
                    "\n 2. Add" +
                    "\n 3. Update" +
                    "\n 4. Delete" +
                    "\n 5. Search" +
                    "\n 6. Exit");
            System.out.println("----Chọn chức năng----");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    displayStudents();
                    break;
                case ADD:
                    addStudent();
                    break;
                case UPDATE:
                    updateStudent();
                    break;
                case DELETE:
                    deleteStudent();
                    break;
                case SEARCH:
                    findStudentById();
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không trùng khớp!");
            }
        }
    }

    private void displayStudents() {
        System.out.println("\n--- List of Students ---");
        for (Student student : studentController.getAll()) {
            System.out.println(student);
        }
    }

    private void addStudent() {
        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        studentController.addStudent(id, name);
        System.out.println("Student added successfully.");
    }

    private void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        studentController.updateStudent(id, name);
    }

    private void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        studentController.deleteStudent(id);
    }

    private void findStudentById() {
        System.out.print("Enter student ID to find: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(studentController.searchStudent(id));
    }
}
