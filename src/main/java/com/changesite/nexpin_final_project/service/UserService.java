package com.changesite.nexpin_final_project.service;

import com.changesite.nexpin_final_project.entity.Accounts;
import com.changesite.nexpin_final_project.entity.Transactions;
import com.changesite.nexpin_final_project.entity.User;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserService {
    void registerUser(User user) {

    }

    User loginUser(String username, String password) {
        return null;
    }

    void forgetPassword(String username) {

    }
    // Diğer metodlar...

    // ADMIN işleri
    void addUserByAdmin(User admin, User user) {

    }

    void deactivateUserByAdmin(User admin, Long userId) {

    }

    List<User> getAllUsers(User admin) {
        return null;
    }

    User getUserById(User admin, Long userId) {
        return null;
    }

    List<Accounts> getAllAccountsByUserId(User admin, Long userId) {
        return null;
    }

    List<Transactions> getAllTransactions(User admin) {
        return null;
    }

    List<Transactions> getTransactionsByAccountNumberAndType(User admin, Long accountNumber, String transactionType) {
        return null;
    }


}

