package com.changesite.nexpin_final_project.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class LoginClientRequest {
    @NotBlank(message = USERNAME_URGENT)
    String userName;

    @Pattern(
    regexp = "^(?=,*[A-Z])(?=,*\\d)(?=,*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
    message = "PASSWORD_REGEX")
    @NotBlank(message = PASSWORD_URGENT)
    String password;
}
