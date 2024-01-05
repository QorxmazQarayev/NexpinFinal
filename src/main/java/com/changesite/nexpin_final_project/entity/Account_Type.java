package com.changesite.nexpin_final_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account_Type {
    //(id, description)
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String description;
    @OneToMany(mappedBy = "accountType")
    List<Accounts> accounts;
}
