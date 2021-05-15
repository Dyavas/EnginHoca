package Gun03_Inheritance2;



public class DataBaseLogger implements Logger {
    @Override
    public void log(String message) {

        System.out.println("Database Loglandi");
    }
}
