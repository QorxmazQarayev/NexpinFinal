package com.changesite.nexpin_final_project.entity;

import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.*;
import jakarta.transaction.Transaction;
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
public class Accounts {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    //account_id,  user_id, account_number, balance, account_type_id, currency,is_active
    Long account_id;
    Long user_id;
    String account_number;
    Double balance;
    Long account_type_id;
    String currency;//cashback, debit
    Boolean is_active;
    @ManyToOne
    @JoinColumn(name="client_id")
    Client client;
    @OneToMany(mappedBy = "account")
    List<Card>cards;
    @OneToMany(mappedBy = "account")
    List<Transaction>transactions;
    @ManyToOne
    @JoinColumn(name="account_type_id")
    Account_Type accountType;

}
