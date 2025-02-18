package ss22_code_test.twodtrieng.service;

import ss22_code_test.twodtrieng.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();

    void add(Student student);

    void edit(int id, Student student);

    boolean delete(int id);

    boolean search(int id);

    List<Student> searchByName(String name);
}
