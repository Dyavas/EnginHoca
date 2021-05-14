package Gun04_Interfaces;

public class CustomerManager {
    public CustomerManager(Logger logger) {
        this.logger = logger;
    }

    private Logger logger;
    public void add(Customer customer){
        System.out.println("Müsteri eklendi"+customer.getFirstName());
        this.logger.log(customer.getFirstName());
    }
    public void delete(Customer customer){
        System.out.println("Müsteri silindi"+customer.getFirstName());
    }
}
