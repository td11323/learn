import java.io.Console;
import java.util.Scanner;
import static java.lang.System.*;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("Name:");
        String name = scanner.nextLine();
        out.print("age:");
        int age = scanner.nextInt();
        out.print("password:");
        Console console = console();
        char[] password = console.readPassword();
        out.printf("name=%s age=%d password=%s\r\n", name, age, new String(password));
        scanner.close();
    }
}