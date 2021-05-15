package Gun03_odev2;

public class UserManager {
    public void add(User user){

        System.out.println(user.getFirstName()+" "+user.getLastName()+" User Eklendi.");

    };
    public void add(User[] users){
        for (User user: users) {
            add(user);
        }
    }

}
