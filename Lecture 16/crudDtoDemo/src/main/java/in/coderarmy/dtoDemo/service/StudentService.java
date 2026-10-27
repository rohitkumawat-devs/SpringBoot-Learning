package in.coderarmy.dtoDemo.service;



import in.coderarmy.dtoDemo.dto.StudentRequestDto;
import in.coderarmy.dtoDemo.entity.Student;
import in.coderarmy.dtoDemo.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component
@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository  = studentRepository;
    }

    public Student createStudent(StudentRequestDto studentRequestDto){
        Student student = mapToEntity(studentRequestDto);
         Student studentResp =  studentRepository.save(student);
         return studentResp;
    }

    public Student getStudent(Long id){
        Optional<Student> studentResp = studentRepository.findByIdAndDeletedIsFalse(id);
        if(studentResp.isPresent()){
            return studentResp.get();
        }
        return null;
    }
    // select * from id where id=1 and isdeleted = false;




    public List<Student> getAllStudent(){
        List<Student> studentList = studentRepository.findByDeletedIsFalse();
        return studentList;
    }
    // select  * from student where deleted is false;

    public Student updateStudent(Long id , Student studentReq){
        Optional<Student> existingStudent  = studentRepository.findByIdAndDeletedIsFalse(id);

        if(existingStudent.isEmpty()){
            return null;
        }
        Student studentToSave = existingStudent.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setRollno(studentReq.getRollno());
        studentToSave.setAge(studentReq.getAge());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setDeleted(false);

        return studentRepository.save(studentToSave);
    }

    public Boolean deleleStudent(Long id){
        Boolean isStudent = studentRepository.existsById(id);

        if(!isStudent){
            return false;
        }

        studentRepository.deleteById(id);
        return true;
    }

    public Boolean deleteStudentSoftly(Long id){
        Optional<Student> exisitingStudent = studentRepository.findByIdAndDeletedIsFalse(id);
        if(exisitingStudent.isEmpty()){
            return false;
        }
        Student studentToSave = exisitingStudent.get();
        studentToSave.setDeleted(true);
        studentRepository.save(studentToSave);

        return true;
    }
}
