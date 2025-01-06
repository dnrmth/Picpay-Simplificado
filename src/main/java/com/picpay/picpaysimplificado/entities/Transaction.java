package com.picpay.picpaysimplificado.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_seq")
    @SequenceGenerator(name = "transaction_seq", sequenceName = "transaction_seq", initialValue = 1, allocationSize = 1)
    private Long id;
    private String recipientsName;
    private Long destinationUserId;
    private BigDecimal value;
    private String senderUserName;
    private Long senderUserId;
    private LocalDateTime transactionDate;

    public Transaction() {
    }

    public Transaction(String recipientsName, Long destinationUserId, BigDecimal value, String senderUserName, Long senderUserId) {
        this.recipientsName = recipientsName;
        this.destinationUserId = destinationUserId;
        this.value = value;
        this.senderUserName = senderUserName;
        this.senderUserId = senderUserId;
        this.transactionDate = LocalDateTime.now();
    }
}
