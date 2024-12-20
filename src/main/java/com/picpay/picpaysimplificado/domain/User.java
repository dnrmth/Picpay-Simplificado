package com.picpay.picpaysimplificado.entity;

public abstract class User {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

    public User(Long id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

}
