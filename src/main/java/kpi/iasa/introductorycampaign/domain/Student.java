package kpi.iasa.introductorycampaign.domain;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
            @JoinColumn()
    Long id;
    {
        rating=0;
    }
    private String firstName;
    private String lastName;
    private String email;
    private double rating;



}
