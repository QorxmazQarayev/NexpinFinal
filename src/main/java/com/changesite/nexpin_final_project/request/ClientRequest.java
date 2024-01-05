package com.changesite.nexpin_final_project.request;

import jakarta.validation.constraints.Email;
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
public class ClientRequest {
    @NotBlank(message=USERNAME_URGENT) String userName;

    @NotBlank(message =FULLNAME_URGENT)

    String fullName;

    @NotBlank(message=EMAIL_IS_NOT_VALID)

    @Email(message =EMAIL_IS_NOT_VALID)

    String email;

    @Pattern(regexp = "^(\\.[0-9]{1,4}[\\s]?)?((\\([0-9]{1,4}\\))|[0-9]{1,4}}[\\]?[0-9](1,14)",
            message = INVALID_PHONE)

    @NotBlank(message = INVALID_PHONE)

    String phoneNumber;

    @Pattern(

            regexp=(?,[8-2])(?.[A-Z])(.\\d)(.[@$%*&])[A-Za-z\\d@$!%+76]{3,}$",message "PASSWORD_REGEX")

    @NotBlank(message = PASSWORD_URGENT)

    String password;

}

