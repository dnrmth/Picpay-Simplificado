package com.picpay.picpaysimplificado.controller;

import com.picpay.picpaysimplificado.dto.ClientDTO;
import com.picpay.picpaysimplificado.dto.ClientDetailedDataDTO;
import com.picpay.picpaysimplificado.dto.TransactionDTO;
import com.picpay.picpaysimplificado.service.ClientService;
import com.picpay.picpaysimplificado.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController()
@RequestMapping("/picpay")
public class PicPayController {

    private final ClientService clientService;
    private final TransactionService transactionService;

    public PicPayController(ClientService clientService, TransactionService transactionService) {
        this.clientService = clientService;
        this.transactionService = transactionService;
    }

    @PostMapping("/register")
    @Transactional
    public ResponseEntity<ClientDetailedDataDTO> Register(@RequestBody ClientDTO client, UriComponentsBuilder uriBuilder) {
        var user = clientService.CreateUser(client);

        var userUri = uriBuilder.path("/picpay/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(userUri).body(new ClientDetailedDataDTO(user));
    }

    @PutMapping
    public ResponseEntity<?> CreatePayment(@RequestBody TransactionDTO transaction, UriComponentsBuilder uriBuilder) {
        var transaction = transactionService.CreateTransaction(transaction);

        return null;
    }


}
