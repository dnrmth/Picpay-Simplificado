package com.picpay.picpaysimplificado.service;

import com.picpay.picpaysimplificado.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final UserRepository userRepository;

    public ClientService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<?> CreatePayment() {
    return null;
    }
}
