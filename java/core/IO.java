import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        PrintWriter writer = new PrintWriter("a.txt");
        writer.write("hello world");
        writer.flush();
        writer.close();
        Scanner sc=new Scanner(Paths.get("a.txt"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}