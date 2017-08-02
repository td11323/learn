import com.wyj.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectInvoke {    
    public static void main(String[] args)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class cls = Student.class;
        Student student = new Student();
        Method method = cls.getMethod("setName",String.class);
        method.invoke(student, "wyj");
        System.out.println(student.getName());
    }
}