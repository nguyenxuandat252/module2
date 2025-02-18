package ss22_code_test.twodtrieng.service;

import ss22_code_test.twodtrieng.model.Student;
import ss22_code_test.twodtrieng.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {

    private final String FILE_STUDENT = "src/ss22_code_test/twodtrieng/data/studen.csv";

    @Override
    public List<Student> getAll() {
        List<String> stringList = ReadAndWriteFile.readFile(FILE_STUDENT);
        List<Student> studentList = new ArrayList<>();
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Student student = new Student(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]), array[4]);
            studentList.add(student);
        }
        return studentList;
    }

    @Override
    public void add(Student student) {
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoData());
        ReadAndWriteFile.writeFile(FILE_STUDENT, stringList, true);
    }

    @Override
    public void edit(int id, Student student) {
        List<Student> studentList = getAll();
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                studentList.set(i, student);
                updateFile(studentList);
            }
        }
    }

    @Override
    public boolean delete(int id) {
        List<Student> studentList = getAll();
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                studentList.remove(i);
                updateFile(studentList);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean search(int id) {
        List<Student> studentList = getAll();
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                System.out.println(studentList.get(i));
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Student> searchByName(String name) {
        List<Student> studentList = getAll();
        List<Student> resultList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                resultList.add(student);
            }
        }
        return resultList;
    }

    public void updateFile(List<Student> studentList) {
        List<String> stringList = new ArrayList<>();
        for (Student student : studentList) {
            stringList.add(student.getInfoData());
        }
        ReadAndWriteFile.writeFile(FILE_STUDENT, stringList, false); // Ghi đè file
    }

    public boolean checkIdStudent(int id) {
        List<Student> studentList = getAll();
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                return true;
            }
        }
        return false;
    }
}
