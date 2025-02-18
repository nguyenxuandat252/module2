package ss22_code_test.twodtrieng.model;

public class Teacher extends Person {
    private String exp;
    private int lesson;
    private String title;

    public Teacher() {
    }

    public Teacher(int id, String name, int salary, String exp, int lesson, String title) {
        super(id, name, salary);
        this.exp = exp;
        this.lesson = lesson;
        this.title = title;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public int getLesson() {
        return lesson;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                ", exp='" + exp + '\'' +
                ", lesson=" + lesson +
                ", title='" + title + '\'' +
                '}';
    }

    public String getInfoData() {
        return this.getId() + "," + this.getName() + "," +
                this.getSalary() + "," + this.getExp() + "," +
                this.getLesson() + "," + this.getTitle();
    }
}
