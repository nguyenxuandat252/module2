package ss22_code_test.twodtrieng.service;

import ss22_code_test.twodtrieng.model.Student;
import ss22_code_test.twodtrieng.model.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> getAll();

    void add(Teacher teacher);

    void edit(int id, Teacher teacher);

    boolean delete(int id);

    boolean search(int id);

    List<Teacher> searchByName(String name);
}
