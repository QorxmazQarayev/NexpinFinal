package com.changesite.nexpin_final_project.response;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class ClientResponse {
    Long id;
    String userName;
    String fullName;
    String email;
    String phoneNumber;
    Boolean is_active;
}
