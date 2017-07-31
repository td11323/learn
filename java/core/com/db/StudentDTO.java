package com.db;
import com.wyj.Student;

public class StudentDTO{
    private int age;

    private String name;

    public StudentDTO(Student student){
        age=student.getAge();
        name=student.getName();
    }

    @Override
    public String toString() {
        return String.format("name=%s age=%d", name,age);
    }
}