package Gun04_Interfaces;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Dosyaya loglandi."+message);
    }
}
