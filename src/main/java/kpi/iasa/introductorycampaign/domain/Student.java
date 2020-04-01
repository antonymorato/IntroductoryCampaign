package kpi.iasa.introductorycampaign.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "students")
public class Student {
    @Id
    @JoinColumn(table = "usr",name = "id")
    private Long id;

    {
        rating=0;
    }
    private String firstName;
    private String lastName;
    private String email;
    private double rating;



}
