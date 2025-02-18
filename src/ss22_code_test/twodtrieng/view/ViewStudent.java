package ss22_code_test.twodtrieng.view;

import ss22_code_test.twodtrieng.model.Student;

import java.util.Scanner;

public class ViewStudent {
    public Scanner scanner = new Scanner(System.in);

    public Student inputDataStudent() {
        System.out.println("Input id: ");
        int id = inputNumber();
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input salary: ");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Input score: ");
        int score = Integer.parseInt(scanner.nextLine());
        System.out.println("Input classification: ");
        String classification = scanner.nextLine();
        Student student = new Student(id, name, salary, score, classification);
        return student;
    }
    public int inputNumber() {
        int id = -1;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id > 0) {
                    break;
                } else {
                    System.out.println("input number > 0, re-input: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter integer");
            }
        }
        return id;
    }
}
