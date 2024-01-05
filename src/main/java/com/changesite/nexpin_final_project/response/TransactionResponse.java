package com.changesite.nexpin_final_project.response;

import com.changesite.nexpin_final_project.entity.Transaction_Type;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class TransactionResponse {
    Long transaction_id;
    Long acc_id;
    Double amount;
    Transaction_Type transactionType;
    LocalDateTime transactionDate;

}
