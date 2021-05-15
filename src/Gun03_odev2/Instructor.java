package Gun03_odev2;

public class Instructor extends User {
    private String Branch;
    private int sumLesson;

    public Instructor(String branch, int sumLesson) {
        Branch = branch;
        this.sumLesson = sumLesson;
    }

    public Instructor(int id, String firstName, String lastName, String gender, String date, String nationality, String adress, String branch, int sumLesson) {
        super(id, firstName, lastName, gender, date, nationality, adress);
        Branch = branch;
        this.sumLesson = sumLesson;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public int getSumLesson() {
        return sumLesson;
    }

    public void setSumLesson(int sumLesson) {
        this.sumLesson = sumLesson;
    }
}