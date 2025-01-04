package com.picpay.picpaysimplificado.entities;

import com.picpay.picpaysimplificado.entities.user.User;
import jakarta.persistence.*;

@Entity
@Table(name = "merchant")
public class Merchant extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String cnpj;

    public Merchant(String firstName, String lastName, String email, String password, String cnpj, String balance) {
        super( firstName, lastName, email, password, balance);
        this.cnpj = cnpj;
    }

    public Merchant() {
    }

    public String getCnpj() {
        return cnpj;
    }
}
