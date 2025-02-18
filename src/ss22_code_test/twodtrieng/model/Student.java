package ss22_code_test.twodtrieng.model;

public class Student extends Person{
    private int score;
    private String classification;

    public Student() {
    }

    public Student(int id, String name, int salary, int score, String classification) {
        super(id, name, salary);
        this.score = score;
        this.classification = classification;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                ", score=" + score +
                ", classification='" + classification + '\'' +
                '}';
    }
    public String getInfoData(){
        return this.getId()+","+this.getName()+","+
                this.getSalary()+","+this.getScore()+","+
                this.getClassification();
    }
}
