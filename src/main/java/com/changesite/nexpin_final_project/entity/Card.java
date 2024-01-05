package com.changesite.nexpin_final_project.entity;

import com.changesite.nexpin_final_project.Actions;
import com.changesite.nexpin_final_project.CardStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Month;
import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card {
    //(id, card_name, pan, expire_month, expire_year,cvc_number, user_id, account_id, is_active)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String card_name;
    Month expire_month;
    String pan; //16-digit number
    Integer cvc;
    Year expire_year;
    Long cvc_number;
    Long user_id;
    Long account_id;
    Boolean is_active;
    @Enumerated(EnumType.STRING)
    @Column(name="action")
    Actions action;
    @Enumerated(EnumType.STRING)
    @Column(name="status")
    CardStatus status;
    @ManyToOne
    @JoinColumn(name="user_id")
    Client client;
    @ManyToOne
    @JoinColumn(name="account_id")
    Accounts account;

}
