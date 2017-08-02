import com.wyj.Student;
import java.lang.Package;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

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
        out.printf("%s %s %s{\r\n",Modifier.toString(cls.getModifiers()), type, cls.getSimpleName());
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
        out.printf("    %s %s(",Modifier.toString(ctor.getModifiers()) ,cls.getSimpleName());
        out.println(");");

    }

    private static void print(Field filed) {

        out.printf("    %s %s %s;\r\n",Modifier.toString(filed.getModifiers()), filed.getType().getSimpleName(), filed.getName());
    }
}