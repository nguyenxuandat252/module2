package ss22_code_test.twodtrieng.view;

import ss22_code_test.twodtrieng.model.Student;
import ss22_code_test.twodtrieng.model.Teacher;

import java.util.Scanner;

public class ViewTeacher {
    public Scanner scanner = new Scanner(System.in);

    public Teacher inputDataTeacher() {
        System.out.println("Input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input salary: ");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Input lesson: ");
        int lesson = Integer.parseInt(scanner.nextLine());
        System.out.println("Input exp: ");
        String exp = scanner.nextLine();
        System.out.println("Input title: ");
        String title = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, salary, exp, lesson, title);
        return teacher;
    }
}
