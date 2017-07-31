import com.wyj.Student;
import java.lang.Package;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import static java.lang.System.out;

public class Reflection {
    public static void main(String[] args) {
        Class cls = Student.class;
        print(cls);
    }

    private static void print(Class cls) {
        Package pack = cls.getPackage();
        out.printf("package %s;\r\n", pack.getName());
        String type = cls.isInterface() ? "interface" : "class";
        type = cls.isEnum() ? "enum" : type;
        out.printf("public %s %s{\r\n", type, cls.getSimpleName());
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            print(f);
            out.println();
        }

        Constructor[] ctors=cls.getConstructors();
        for (Constructor ctor : ctors) {
            print(ctor,cls);    
        }

        out.println("}");
    }

    private static void print(Constructor ctor,Class cls){
        out.printf("    public %s(",cls.getSimpleName());
        out.println(");");

    }

    private static void print(Field filed) {

        out.printf("    private %s %s;\r\n", filed.getType().getSimpleName(), filed.getName());
    }
}