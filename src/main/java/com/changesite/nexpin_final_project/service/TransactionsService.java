package com.changesite.nexpin_final_project.service;

import com.changesite.nexpin_final_project.entity.Transactions;
import com.changesite.nexpin_final_project.repository.TransactionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionsService {
    @Autowired
    private TransactionsRepository transactionsRepository;

    public List<Transactions> getAllTransactionsByAccountId(Long accountId) {
        // implement logic to get all transactions by account id
        return null;
    }

    public List<Transactions> getTransactionsByAccountIdAndTypeAndDateRange
            (Long accountId, Long transactionTypeId, LocalDateTime startDate) {
        // implement logic to get transactions by account id, type, and date range
        return null;
    }
}
