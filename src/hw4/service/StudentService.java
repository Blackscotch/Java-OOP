package hw4.service;

import hw4.model.Student;
import hw4.model.User;

import java.util.List;

public interface StudentService<T extends User>{
    void add(Student student);
    void remove(Student student);
    void addAppend(Student student);
    void read();
    List<Student> getAllStudents();
}
