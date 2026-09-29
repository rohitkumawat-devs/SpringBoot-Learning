package in.coderarmy.crudSpringBootDemo.service;

import in.coderarmy.crudSpringBootDemo.entity.Student;
import in.coderarmy.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository  = studentRepository;
    }

    public Student createStudent(Student studentReq){
        // business Logic
        // store to db
        System.out.println("Inside Student Service");
        Student studentResp = studentRepository.saveStudent(studentReq);
        System.out.println("Exiting Student Service");


        return studentResp;
    }
}
