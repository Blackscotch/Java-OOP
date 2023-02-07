package hw4.service;

import hw4.model.Teacher;
import hw4.model.User;

import java.util.List;

public interface TeacherService <T extends User> {
    void addTeacher(Teacher teacher);
    void removeTeacher(Teacher teacher);
    void addAppendTeacher(Teacher teacher);
    void readTeacher();
    List<Teacher> getAllTeachers();
}
