package com.picpay.picpaysimplificado.entities;

import com.picpay.picpaysimplificado.dto.TransactionDTO;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

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

    public Transaction(TransactionDTO transactionDTO){
        this.recipientsName = transactionDTO.recipientsName();
        this.destinationUserId = transactionDTO.destinationUserId();
        this.value = new BigDecimal(transactionDTO.value());
        this.senderUserName = transactionDTO.senderUserName();
        this.senderUserId = transactionDTO.senderUserId();
        this.transactionDate = LocalDateTime.now();

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id) && Objects.equals(recipientsName, that.recipientsName) && Objects.equals(destinationUserId, that.destinationUserId) && Objects.equals(value, that.value) && Objects.equals(senderUserName, that.senderUserName) && Objects.equals(senderUserId, that.senderUserId) && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recipientsName, destinationUserId, value, senderUserName, senderUserId, transactionDate);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", recipientsName='" + recipientsName + '\'' +
                ", destinationUserId=" + destinationUserId +
                ", value=" + value +
                ", senderUserName='" + senderUserName + '\'' +
                ", senderUserId=" + senderUserId +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
