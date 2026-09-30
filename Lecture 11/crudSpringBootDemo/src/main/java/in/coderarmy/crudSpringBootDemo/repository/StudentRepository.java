package in.coderarmy.crudSpringBootDemo.repository;

import in.coderarmy.crudSpringBootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository no use since we can't make object of interface
public interface StudentRepository extends JpaRepository<Student ,Long> {

}
