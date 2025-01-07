package com.picpay.picpaysimplificado.entities;

import com.picpay.picpaysimplificado.dto.ClientDTO;
import com.picpay.picpaysimplificado.enums.UserType;
import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "client")
@Getter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    @SequenceGenerator(name = "client_seq", sequenceName = "client_seq", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "fullname")
    private String fullName;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String document;

    private String password;

    private BigDecimal balance;

    @Column(name = "usertype")
    private UserType userType;

    public Client() {
    }


    public Client(String fullname, String email, String document, String password, String balance, UserType userType) {
        this.fullName= fullname;
        this.email = email;
        this.document = document;
        this.password = password;
        this.balance = new BigDecimal(balance);
        this.userType = userType;
    }

    public Client(ClientDTO clientDTO) {
        this.fullName = clientDTO.fullName();
        this.email = clientDTO.email();
        this.document = clientDTO.document();
        this.password = clientDTO.password();
        this.balance = new BigDecimal(clientDTO.balance());
        this.userType = clientDTO.userType();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(fullName, client.fullName) && Objects.equals(email, client.email) && Objects.equals(document, client.document) && Objects.equals(password, client.password) && Objects.equals(balance, client.balance) && userType == client.userType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, email, document, password, balance, userType);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", document='" + document + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", userType=" + userType +
                '}';
    }
}
