package in.coderarmy.service;

import in.coderarmy.entity.Student;
import in.coderarmy.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentResp){
        return studentRepository.save(studentResp);
    }

    public Student getStudent(Long id){
        return studentRepository.findById(id);
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

}
