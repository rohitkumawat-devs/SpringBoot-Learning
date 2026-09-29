package in.coderarmy.crudSpringBootDemo.repository;

import in.coderarmy.crudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent(Student studentReq){
        // save to db
        System.out.println("Inside Student Repository");
        Student s1 = new Student();
        s1.setName("Raghav");
        s1.setAge(23);
        s1.setEmail("raghav@gmail.com");
        s1.setRollno(34);
        s1.setSubject("SpringBoot FrameWork");
        System.out.println("Exiting Student Repository");
        return s1;
    }
}
