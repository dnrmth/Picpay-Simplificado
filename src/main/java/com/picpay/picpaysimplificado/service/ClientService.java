package com.picpay.picpaysimplificado.service;

import com.picpay.picpaysimplificado.dto.TransactionDTO;
import com.picpay.picpaysimplificado.entities.Client;
import com.picpay.picpaysimplificado.repository.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ResponseEntity<?> MakeTransaction(TransactionDTO transactionDTO) {

        clientRepository.save(transactionDTO);
    }
}
