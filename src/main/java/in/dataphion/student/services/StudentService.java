package in.dataphion.student.services;

import in.dataphion.student.model.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    List<Student> getAllStudents();
}
