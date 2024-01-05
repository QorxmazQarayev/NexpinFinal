package com.changesite.nexpin_final_project.service;

import com.changesite.nexpin_final_project.entity.Accounts;
import com.changesite.nexpin_final_project.entity.User;
import com.changesite.nexpin_final_project.repository.AccountsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountsService {
    void increaseBalance(User user, double amount) {

    }

    void makePayment(User user, double amount) {

    }

    double cashbackByCriteria(User user, double amount, String criteriaType) {
        return 0;
    }

    void transferBetweenAccounts(User user, Long sourceAccountNumber, Long destinationAccountNumber, double amount){

    }
}
