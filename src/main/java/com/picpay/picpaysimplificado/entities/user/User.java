package com.picpay.picpaysimplificado.entities.user;


import java.math.BigDecimal;

public abstract class User {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private BigDecimal balance;

    public User() {
    }

    public User( String firstName, String lastName, String email, String password, String balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.balance = new BigDecimal(balance);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
