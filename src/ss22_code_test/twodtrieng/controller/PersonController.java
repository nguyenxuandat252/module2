package ss22_code_test.twodtrieng.controller;

import ss22_code_test.twodtrieng.model.Student;
import ss22_code_test.twodtrieng.model.Teacher;
import ss22_code_test.twodtrieng.service.StudentService;
import ss22_code_test.twodtrieng.service.TeacherService;
import ss22_code_test.twodtrieng.view.ViewStudent;
import ss22_code_test.twodtrieng.view.ViewTeacher;

import java.util.List;
import java.util.Scanner;

public class PersonController {
    Scanner scanner = new Scanner(System.in);
    StudentService studentService = new StudentService();
    TeacherService teacherService = new TeacherService();
    ViewStudent viewStudent = new ViewStudent();
    ViewTeacher viewTeacher = new ViewTeacher();

    public void mainMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("---Menu---" +
                    "\n 1. Display All" +
                    "\n 2. Add" +
                    "\n 3. Edit" +
                    "\n 4. Delete" +
                    "\n 5. Search" +
                    "\n 6. SearchByName");
            System.out.print("Select: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("-----Student List------");
                    for (Student student : studentService.getAll()) {
                        System.out.println(student);
                    }
                    System.out.println("-----Teacher List------");
                    for (Teacher teacher : teacherService.getAll()) {
                        System.out.println(teacher);
                    }
                    break;
                case 2:
                    menuAdd();
                    break;
                case 3:
                    System.out.println("Input id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    if (studentService.checkIdStudent(id)) {
                        studentService.edit(id, viewStudent.inputDataStudent());
                    } else if (teacherService.checkIdTeacher(id)) {
                        teacherService.edit(id, viewTeacher.inputDataTeacher());
                    } else {
                        System.out.println("id not found !");
                    }
                    break;
                case 4:
                    System.out.println("Input id:");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    if (studentService.checkIdStudent(id1)) {
                        studentService.delete(id1);
                    } else if (teacherService.checkIdTeacher(id1)) {
                        teacherService.delete(id1);
                    }else {
                        System.out.println("id not found !");
                    }
                    break;
                case 5:
                    System.out.println("Input id:");
                    int id3 = Integer.parseInt(scanner.nextLine());
                    if (studentService.checkIdStudent(id3)) {
                        studentService.search(id3);
                    } else if(teacherService.checkIdTeacher(id3)) {
                        teacherService.search(id3);
                    } else {
                        System.out.println("id not found !");
                    }
                    break;
                case 6:
                    System.out.println("Input name:");
                    String name = scanner.nextLine();
                    List<Student> studentSearchList = studentService.searchByName(name);
                    int count = 0;
                    System.out.println("-----Student List----");
                    for (Student student : studentSearchList) {
                        System.out.println(student);
                        count++;
                    }
                    if (count == 0) {
                        System.out.println("Not found !");
                    }
                    List<Teacher> teacherSearchList = teacherService.searchByName(name);
                    int count1 = 0;
                    System.out.println("-----Teacher List----");
                    for (Teacher teacher : teacherSearchList) {
                        System.out.println(teacher);
                        count1++;
                    }
                    if (count1 == 0) {
                        System.out.println("Not found !");
                    }
                    break;
            }
        }
    }

    public void menuAdd() {
        boolean flag = true;
        while (flag) {
            System.out.println("---Menu Add---" +
                    "\n 1. Student" +
                    "\n 2. Teacher" +
                    "\n 3. Main menu");
            System.out.print("Select: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentService.add(viewStudent.inputDataStudent());
                    break;
                case 2:
                    teacherService.add(viewTeacher.inputDataTeacher());
                    break;
                case 3:
                    mainMenu();
                    break;
            }
        }
    }
}
