package com.changesite.nexpin_final_project.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transaction;
import lombok.*;
import lombok.experimental.FieldDefaults;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction_Details {
    //(id, transactions_id,  service_id, organization_service_code)
    //(79 (id), 1200 (transaction_id),  100023 , 01245455 (azerishiq abonent kodu –bazada saxlanilmir ) )

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     Long transactions_id;
     Long service_id;
     String organization_service_code;//azeriqaz abanent kodu,bazada saxlanilmir
    @ManyToOne
    @JoinColumn(name="transaction_id")
    Transaction transaction;
    @ManyToOne
    @JoinColumn(name="services_id")
    Services services;

}
