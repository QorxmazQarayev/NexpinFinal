package com.changesite.nexpin_final_project.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Locale;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction_Type {
    //(id, name,category) (1, APTEK, Məxaric)(2,  TopUp, Mədaxil ),

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String category;
    @OneToMany(mappedBy = "transaction_Type")
    List<Transactions> transactionsList;


}
