package service;

import model.Student;

import java.util.ArrayList;

public class StudentService implements IStudentService {
    private static ArrayList<Student> students= new ArrayList<>();
    static {
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));
    }

    public ArrayList<Student> getAll(){
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void updateStudent(int id,String name){
        for(Student student:students){
            if(student!=null && student.getId()==id){
                student.setName(name);
                System.out.println("Sửa thông tin thành công");
                return;
            }
        }
        System.out.println("ID không trùng khớp!");
    }
    public void deleteStudent(int id){
        boolean check = students.removeIf(student -> student.getId()==id);
        if(check){
            System.out.println("Xoá thành công");
        }else {
            System.out.println("ID không trùng khớp");
        }
    }
    public Student searchStudent(int id){
        for(Student student:students){
            if(student!=null && student.getId()==id){
                return student;
            }
        }
        return null;
    }
}
