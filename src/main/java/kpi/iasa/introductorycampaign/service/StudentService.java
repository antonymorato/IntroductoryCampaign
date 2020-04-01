package kpi.iasa.introductorycampaign.service;

import kpi.iasa.introductorycampaign.domain.Student;
import kpi.iasa.introductorycampaign.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Optional<Student> findById(Long id){
      return studentRepo.findById(id);
    }
    public void saveStudent(Student student){
        studentRepo.save(student);
    }

    public List<Student> getAll(){
        return studentRepo.findAll();
    }

}
