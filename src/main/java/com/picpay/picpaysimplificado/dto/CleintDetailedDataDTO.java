package com.picpay.picpaysimplificado.dto;

import com.picpay.picpaysimplificado.entities.Client;

import java.math.BigDecimal;

public record CleintDetailedDataDTO(Long id, String fullName, String document, String email, BigDecimal balance) {

    public CleintDetailedDataDTO(Client user) {
        this(user.getId(), user.getFullName(), user.getDocument(), user.getEmail(), user.getBalance());
    }
}
