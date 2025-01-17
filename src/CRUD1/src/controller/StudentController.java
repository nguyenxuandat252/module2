package controller;

import model.Student;
import service.StudentService;

import java.util.ArrayList;

public class StudentController {
    private StudentService studentService = new StudentService();

    public ArrayList<Student> getAll() {
        return studentService.getAll();
    }

    public void addStudent(int id, String name) {
        Student student = new Student(id, name);
        studentService.addStudent(student);
    }

    public void updateStudent(int id, String name) {
        studentService.updateStudent(id, name);
    }

    public void deleteStudent(int id) {
        studentService.deleteStudent(id);
    }

    public Student searchStudent(int id) {
        return studentService.searchStudent(id);
    }
}
