package com.picpay.picpaysimplificado.service;

import com.picpay.picpaysimplificado.dto.ClientDTO;
import com.picpay.picpaysimplificado.entities.Client;
import com.picpay.picpaysimplificado.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client CreateUser(ClientDTO clientDTO) {
        Client client = new Client(clientDTO);

        clientRepository.save(client);

        return client;
    }


}
