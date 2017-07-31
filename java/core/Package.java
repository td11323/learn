import com.wyj.Student;
import com.db.StudentDTO;

public class Package{
    public static void main(String[] args){
        Student student=new Student();
        student.setName("wyj");
        student.setAge(23);
        System.out.println(student.getName());
        StudentDTO dto=new StudentDTO(student);
        System.out.println(dto);
    }
}