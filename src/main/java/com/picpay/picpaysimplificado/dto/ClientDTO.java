package com.picpay.picpaysimplificado.dto;

import com.picpay.picpaysimplificado.enums.UserType;

public record ClientDTO(
        String fullName,
        String email,
        String document,
        String password,
        String balance,
        UserType userType
        ) {
}
