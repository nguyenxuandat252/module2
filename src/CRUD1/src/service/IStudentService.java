package service;

import model.Student;

import java.util.ArrayList;

public interface IStudentService {
    ArrayList<Student> getAll();

    void addStudent(Student student);

    void deleteStudent(int id);

    Student searchStudent(int id);

}
