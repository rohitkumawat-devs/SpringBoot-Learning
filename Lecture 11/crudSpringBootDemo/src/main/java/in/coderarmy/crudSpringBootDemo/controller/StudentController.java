package in.coderarmy.crudSpringBootDemo.controller;

import in.coderarmy.crudSpringBootDemo.entity.Student;
import in.coderarmy.crudSpringBootDemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    // Create Student
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody  Student student){
        System.out.println("Inside Student Controller");
        Student createdstudent = studentService.createStudent(student);
        System.out.println("Exiting Student Controller");
        return ResponseEntity.status(HttpStatus.CREATED).body(createdstudent);
    }

    // Read Student

    // Update

    // Delete Student
}
