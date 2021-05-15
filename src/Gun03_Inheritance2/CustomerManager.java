package Gun03_Inheritance2;



public class CustomerManager {
    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    private Logger[] loggers;

    public void add(Customer customer){
     Utils utils=new Utils();
     utils.runLoggers(loggers, customer.getFirstName());

    }
}
