package Gun03_Inheritance2;

public class Utils {
    public void runLoggers(Logger[] loggers,String message){
        for (Logger logger: loggers
             ) {
            logger.log(message);

        }
    }
}
