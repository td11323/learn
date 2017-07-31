import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class IO {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter writer = new PrintWriter("a.txt");
        writer.write("hello world");
        writer.flush();
        writer.close();
    }
}