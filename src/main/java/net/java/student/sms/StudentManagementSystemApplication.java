package net.java.student.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.java.student.sms.entity.Student;
import net.java.student.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
@Autowired
private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student("Kulesh","Uchiha","kulesh143143@yahoo.com");
//		studentRepository.save(student1);
//		Student student2=new Student("KalEl","Simba","simba@yahoo.com");
//		studentRepository.save(student2);
//		Student student3=new Student("Riley","Cabbage","Kappa@yahoo.com");
//		studentRepository.save(student3);
	}

}
