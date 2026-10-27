package in.coderarmy.dtoDemo.controller;

import in.coderarmy.dtoDemo.dto.StudentRequestDto;
import in.coderarmy.dtoDemo.entity.Student;
import in.coderarmy.dtoDemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    // Create Student
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody StudentRequestDto studentRequestDto){
        Student createdstudent = studentService.createStudent(studentRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdstudent);
    }

    // Read Student
    @GetMapping("/get")
    public ResponseEntity<Student> getStudent(@RequestParam Long id){
        Student studentRes = studentService.getStudent(id);
        if(studentRes==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(studentRes);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> studentList = studentService.getAllStudent();
        if(studentList.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(studentList);
    }
    // Update
    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestParam Long id , @RequestBody Student studentReq){
        Student studentResp = studentService.updateStudent(id , studentReq);
        if(studentResp ==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(studentResp);
    }

    // Delete Student
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteStudent(@RequestParam Long id){
        boolean isdeleted = studentService.deleleStudent(id);
        if(!isdeleted){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok("Record Deleted");
    }

    @PatchMapping("/delete-soft")
    public ResponseEntity<String> deleteStudentSoftly(@RequestParam Long id){
        Boolean isDeleted = studentService.deleteStudentSoftly(id);
        if(!isDeleted){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Record Deleted");
    }
}
