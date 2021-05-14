package Gun03_odev2;

public class InstructorManager extends UserManager {

    public void add(User user){
        user.getId();
        user.getFirstName();
        user.getLastName();
        user.getAdress();
        user.getDate();
        user.getGender();
        user.getNationality();

    };

    public void update(){
        System.out.println("Instructor User Account Updated.");
    };

    public void delete(){
        System.out.println("Instructor User Account Deleted.");
    };
}
