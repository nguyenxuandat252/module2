package ss5_static.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";
    Student(int r, String n){
        this.rollno=r;
        this.name=n;
    }

    static void changge(){
        college="CODEGYM";
    }

    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }

    public static void main(String[] args) {
        Student.changge();
        Student s1 = new Student(1,"S1");
        Student s2 = new Student(2,"S2");
        Student s3 = new Student(3,"S3");
        s1.display();
        s2.display();
        s3.display();
    }
}
