package hw4.controller;

import hw4.model.Student;
import hw4.model.Teacher;
import hw4.model.User;
import hw4.service.impl.StudentServiceImpl;

public class StudentController {
    private final StudentServiceImpl<Student> studentService = new StudentServiceImpl<>();
    public void getStudentInfo(String name, float grade, int year, Teacher teacher){
        studentService.add(new Student(name, grade, year, teacher));
    }
}
