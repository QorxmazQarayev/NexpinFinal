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
public class Cashback{
    //(transaction_id, refund_amount, account_id)
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long transaction_id;
    Double refund_amount;
    @ManyToOne
            @JoinColumn(name="transaction_id")
    Transaction transaction;
    @ManyToOne
            @JoinColumn(name="account_id")
            Accounts account;
    Long account_id;



}
