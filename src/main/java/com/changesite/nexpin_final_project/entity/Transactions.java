package com.changesite.nexpin_final_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transactions {
    // (Transaction_id, Account_id, Amount, Transaction_type_id, Transaction_date)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Transaction_id;
    Long Account_id;
    BigDecimal Amount;
    Long Transaction_type_id;
    LocalDateTime Transaction_date;

}
