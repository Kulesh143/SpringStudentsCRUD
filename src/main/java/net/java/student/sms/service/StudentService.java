package net.java.student.sms.service;

import java.util.List;

import net.java.student.sms.entity.Student;

public interface StudentService {
List<Student>getAllStudents();
Student saveStudent(Student student);
Student getStudentById(Long id);
Student updateStudent(Student student);
void deleteStudentById(Long id);
}
