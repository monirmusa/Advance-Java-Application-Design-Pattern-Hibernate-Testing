/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.hibernatedemo;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.*;

/**
 *
 * @author Monirujjaman
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of={"id"})
@Entity
public class Student {
    @Id
    private long id;
    private Name name;
    private LocalDate dob;
    @Size(min=5,max=10,message="Enter 5 to 10 character")
    private String email;
    @ElementCollection
    private List<String> phoneList;
   
    @Enumerated(EnumType.STRING)
    private Gender gender;
   

 }
