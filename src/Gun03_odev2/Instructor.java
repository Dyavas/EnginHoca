package Gun03_odev2;

public class Instructor extends User {
    private String Branch;

    public Instructor(String branch) {
        this.Branch = branch;
    }

    public String getBranch() {

        return this.Branch;
    }

    public void setBranch(String branch) {

        this.Branch = branch;
    }
}
