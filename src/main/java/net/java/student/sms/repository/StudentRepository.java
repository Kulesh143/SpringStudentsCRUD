package net.java.student.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.student.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
