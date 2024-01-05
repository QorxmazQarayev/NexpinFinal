package com.changesite.nexpin_final_project.dto;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String accessToken;
    private String token_type="Bearer";

    public AuthResponseDto(String accessToken) {
        this.accessToken = accessToken;
    }
}
