package Gun03_Inheritance2;



public class EmailLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Email Loglandi");
    }
}
