package hw4;

import hw4.model.Student;
import hw4.model.Teacher;
import hw4.service.impl.StudentServiceImpl;
import hw4.service.impl.TeacherServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("\nДЕЙСТВИЯ СО СТУДЕНТАМИ\n");
        StudentServiceImpl<Student> studentService = new StudentServiceImpl<>();
        Student Backy = new Student("Backy", 4.92f , 4, new Teacher("Vlad Smirnow", new ArrayList<>()));
        studentService.add(Backy);

        Student Sam = new Student("Sam", 4.5f , 6, new Teacher("Oscar Wild", new ArrayList<>()));
        Student Hrom = new Student("Hrom", 4.9f , 6, new Teacher("Sirius Snag", new ArrayList<>()));
        studentService.addAppend(Sam);
        studentService.addAppend(Hrom);

        studentService.read();
        studentService.remove(Backy);

        Student Jim = new Student("Jim", 4.3f , 8, new Teacher("Grim Strouk", new ArrayList<>()));
        studentService.addAppend(Jim);

        System.out.println(studentService.getAllStudents());

        System.out.println("\nДЕЙСТВИЯ С УЧИТЕЛЯМИ\n");
        TeacherServiceImpl<Teacher> teacherService = new TeacherServiceImpl<>();

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(Backy);
        myStudents.add(Sam);
        teacherService.addTeacher(new Teacher("Sirius Snag", myStudents));

        List<Student> myStudents2 = new ArrayList<>();
        myStudents2.add(Hrom);
        Teacher Snag = new Teacher("Sirius Snag", myStudents2);
        teacherService.addAppendTeacher(Snag);

        teacherService.readTeacher();
        teacherService.removeTeacher(Snag);
        System.out.println(teacherService.getAllTeachers());
    }
}
