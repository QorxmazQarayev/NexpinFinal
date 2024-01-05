package com.changesite.nexpin_final_project.request;

import com.changesite.nexpin_final_project.entity.Account_Type;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import static com.changesite.nexpin_final_project.constant.Constants.ACCOUNT_TYPE_URGENT;
import static com.changesite.nexpin_final_project.constant.Constants.CURRENCY_URGENT;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class AccountCreationRequest {
    @NotBlank(message = ID_URGENT)
    Long id;
    @NotBlank(message = ACCOUNT_TYPE_URGENT)
    Account_Type accountType;
    @NotBlank(message = CURRENCY_URGENT)
    String currency;
}
