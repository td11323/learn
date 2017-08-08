import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException;

public class Pros {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Properties ps = new Properties();
        ps.put("name", "me");
        ps.put("age", "23");
        FileOutputStream stream = new FileOutputStream("a.properties");
        ps.store(stream, "test");
        stream.flush();
        stream.close();

        FileInputStream inStream = new FileInputStream("a.properties");
        ps = new Properties();
        ps.load(inStream);

        String name = ps.getProperty("name");
        String ageString = ps.getProperty("age");
        System.out.println(ageString);
        int age = Integer.parseInt(ageString);
        System.out.printf("name=%s, age=%d \r\n", name, age);

        inStream.close();

        Properties settings = System.getProperties();
        for (Object key : settings.keySet()) {
            System.out.printf("%s = %s \r\n", key, settings.getProperty(key.toString()));
        }
    }
}