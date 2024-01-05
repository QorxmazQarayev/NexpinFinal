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
public class Rol {
    //(id, name)   USER, ADMİN
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    String name;//User or Admin -created  enum if needed
    @OneToMany(mappedBy = "rol")
    List<Client>clients;


}
