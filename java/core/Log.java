import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Log.class.getName());
        logger.setLevel(Level.INFO);
        logger.warning("file is not exists");
        Test(logger);
    }

    private static void Test(Logger logger) {
        logger.entering(Log.class.getName(), "Test");
        logger.severe("out of memory");

        logger.exiting(Log.class.getName(), "Test");
    }
}