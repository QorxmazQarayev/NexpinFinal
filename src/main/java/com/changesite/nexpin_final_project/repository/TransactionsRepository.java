package com.changesite.nexpin_final_project.repository;

import com.changesite.nexpin_final_project.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionsRepository extends JpaRepository<Transactions, Long> {
    List<Transactions> findByAccountId(Long accountId);
    List<Transactions> findByAccountIdAndTransactionTypeIdAndTransactionDateAfter
            (Long accountsId, Long transactionTypeId, LocalDateTime startDate);

}
