package hw4.service.impl;

import hw4.model.Student;
import hw4.model.User;
import hw4.repository.StudentRepository;
import hw4.service.StudentService;

import java.util.List;

public class StudentServiceImpl<S extends User> implements StudentService {
    private final StudentRepository repository = new StudentRepository();
    @Override
    public void add(Student student) {
        if (student != null) {
            repository.save(student);
        } else {
            System.out.println("Student is null!");
        }
    }
    @Override
    public void remove(Student student) {
        repository.remove(student);
    }
    @Override
    public void addAppend(Student student) {
        if (student != null) {
            repository.saveAppend(student);
        } else {
            System.out.println("Student is null!");
        }
    }
    @Override
    public void read() {
        repository.read();
    }
    public List<Student> getAllStudents() {
        return repository.getAllStudents();
    }

}
