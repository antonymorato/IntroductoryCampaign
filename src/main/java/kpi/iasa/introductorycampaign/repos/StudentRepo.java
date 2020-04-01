package kpi.iasa.introductorycampaign.repos;

import kpi.iasa.introductorycampaign.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Long> {

//List<Student> getAll();
//Student getById(Long id);


}
