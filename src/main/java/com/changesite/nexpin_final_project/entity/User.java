package com.changesite.nexpin_final_project.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.userdetails.UserDetails;

import javax.management.relation.Role;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User{
    @Id
    @SequenceGenerator(
            name="user_id_sequence",
            sequenceName = "user_id_sequence",
            allocationSize =1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "user_id_sequence")
    //user_id, username,  email, password, role, fulName, is_active
    Long id;
            @Column(name="name_surname")
            String fullName;
    String userName;
    String email;
    String password;
    @OneToMany(mappedBy = "userId")
    Rol role;//User,Admin
    Boolean is_active;
  //  private List<Accounts> accounts;
}
