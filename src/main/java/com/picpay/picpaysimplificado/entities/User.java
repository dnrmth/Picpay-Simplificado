package com.picpay.picpaysimplificado.entities;

import com.picpay.picpaysimplificado.enums.UserType;
import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;

@Entity
@Table(name = "user")
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", initialValue = 1, allocationSize = 1)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String document;

    private String password;

    private BigDecimal balance;

    private UserType userType;

    public User() {
    }


    public User( String firstName, String lastName, String email, String document, String password, String balance, UserType userType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.document = document;
        this.password = password;
        this.balance = new BigDecimal(balance);
        this.userType = userType;
    }

}
