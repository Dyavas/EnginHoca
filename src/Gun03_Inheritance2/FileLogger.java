package Gun03_Inheritance2;



public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Dosya Loglandi");

    }
}
