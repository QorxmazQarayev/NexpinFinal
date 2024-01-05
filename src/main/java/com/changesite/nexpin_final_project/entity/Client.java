package com.changesite.nexpin_final_project.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String UserName;
    String fullName;
    String email;
    String phoneNumber;
    String password;
    Boolean is_active;
    @OneToMany(mappedBy = "client")
    List<Accounts> accounts;
    @ManyToOne
    @JoinColumn(name="role_id")
    Rol rol;

}
