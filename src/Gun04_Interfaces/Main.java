package Gun04_Interfaces;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new SmsLogger()) {

        };
        Customer Davut=new Customer(1,"Davut","Yavas");

        customerManager.add(Davut);
    }
}
