package com.changesite.nexpin_final_project.request;

import com.changesite.nexpin_final_project.entity.Transaction_Type;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import static com.changesite.nexpin_final_project.constant.Constants.*;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class TransactionRequest  {
    @NotBlank(message = ACCOUNT_ID_URGENT)
    Long acc_id;
    @NotBlank(message = AMOUNT_URGENT)
    Double amount;
    @Max(value=1000,message =EXCEED_LIMIT)
    @NotBlank(message = TRANSACTION_TYPE_URGENT)
    Transaction_Type transactionType;
    @NotBlank(message = CURRENCY_URGENT)
    String currency;

}
