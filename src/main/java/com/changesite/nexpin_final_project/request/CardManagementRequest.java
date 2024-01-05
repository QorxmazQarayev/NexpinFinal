package com.changesite.nexpin_final_project.request;

import com.changesite.nexpin_final_project.Actions;
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
public class CardManagementRequest {
    @NotBlank(message =CLIENT_ID_URGENT)
    Long client_id;
    @NotBlank(message = ACCOUNT_ID_URGENT)
    Long acc_id;
    @NotBlank(message = ACTION_URGENT)
    Actions actions;
}
