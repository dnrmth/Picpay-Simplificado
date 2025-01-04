package com.picpay.picpaysimplificado.entities;

import com.picpay.picpaysimplificado.entities.user.User;
import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String cpf;

    public Client() {
    }

    public Client( String firstName, String lastName, String email, String password, String cpf, String balance) {
        super(firstName, lastName, email, password, balance);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

}
