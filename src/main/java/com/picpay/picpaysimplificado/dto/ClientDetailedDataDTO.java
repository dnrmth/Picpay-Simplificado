package com.picpay.picpaysimplificado.dto;

import com.picpay.picpaysimplificado.entities.Client;

import java.math.BigDecimal;

public record ClientDetailedDataDTO(Long id, String fullName, String document, String email, BigDecimal balance) {

    public ClientDetailedDataDTO(Client user) {
        this(user.getId(), user.getFullName(), user.getDocument(), user.getEmail(), user.getBalance());
    }
}
