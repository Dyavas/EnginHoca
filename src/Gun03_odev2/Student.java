package Gun03_odev2;

public class Student extends User {
private String classe;
private boolean status;

    public Student(int id, String firstName, String lastName, String gender, String date, String nationality, String adress, String classe, boolean status) {
        super(id, firstName, lastName, gender, date, nationality, adress);
        this.classe = classe;
        this.status = status;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
