package ss22_code_test.twodtrieng.service;

import ss22_code_test.twodtrieng.model.Teacher;
import ss22_code_test.twodtrieng.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements ITeacherService {
    private final String FILE_TEACHER = "src/ss22_code_test/twodtrieng/data/teacher.csv";

    @Override
    public List<Teacher> getAll() {
        List<String> stringList = ReadAndWriteFile.readFile(FILE_TEACHER);
        List<Teacher> teacherList = new ArrayList<>();
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Teacher teacher = new Teacher(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]);
            teacherList.add(teacher);
        }
        return teacherList;
    }

    @Override
    public void add(Teacher teacher) {
        List<String> stringList = new ArrayList<>();
        stringList.add(teacher.getInfoData());
        ReadAndWriteFile.writeFile(FILE_TEACHER, stringList, true);
    }

    @Override
    public void edit(int id, Teacher teacher) {
        List<Teacher> teacherList = getAll();
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {
                teacherList.set(i, teacher);
                updateFile(teacherList);
            }
        }
    }

    @Override
    public boolean delete(int id) {
        List<Teacher> teacherList = getAll();
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {
                teacherList.remove(i);
                updateFile(teacherList);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean search(int id) {
        List<Teacher> teacherList = getAll();
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {
                System.out.println(teacherList.get(i));
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Teacher> searchByName(String name) {
        List<Teacher> teacherList = getAll();
        List<Teacher> resultList = new ArrayList<>();
        for (Teacher teacher : teacherList) {
            if (teacher.getName().toLowerCase().contains(name.toLowerCase())) {
                resultList.add(teacher);
            }
        }
        return resultList;
    }

    public void updateFile(List<Teacher> teacherList) {
        List<String> stringList = new ArrayList<>();
        for (Teacher teacher : teacherList) {
            stringList.add(teacher.getInfoData());
        }
        ReadAndWriteFile.writeFile(FILE_TEACHER, stringList, false); // Ghi đè file
    }

    public boolean checkIdTeacher(int id) {
        List<Teacher> teacherList = getAll();
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {
                return true;
            }
        }
        return false;
    }
}
