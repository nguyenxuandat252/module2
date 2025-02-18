package ss10_arraylist.thuc_hanh.bai1;

public class MyListTest {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyList<Student> myList=new MyList<>();
        Student student1=new Student(1, "trung");
        Student student2=new Student(2, "chánh");
        Student student3=new Student(3, "hải");

        myList.addFirst(student1);
        for (int i=0;i<myList.size();i++){
            Student student= (Student) myList.get(i);
            System.out.println(student.getName());
        }
    }

}
