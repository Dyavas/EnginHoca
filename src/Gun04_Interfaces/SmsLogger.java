package Gun04_Interfaces;

public class SmsLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Smse loglandi"+message);
    }
}
