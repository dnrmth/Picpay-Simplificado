package com.picpay.picpaysimplificado.dto;

public record TransactionDTO(String recipientsName, String value, Long destinationUserId, Long senderUserId, String senderUserName) {
}
