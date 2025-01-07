package com.picpay.picpaysimplificado.controller;

import com.picpay.picpaysimplificado.dto.ClientDTO;
import com.picpay.picpaysimplificado.dto.TransactionDTO;
import com.picpay.picpaysimplificado.dto.CleintDetailedDataDTO;
import com.picpay.picpaysimplificado.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController()
@RequestMapping("/picpay")
public class PicPayController {

    private final ClientService clientService;

    public PicPayController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/register")
    @Transactional
    public ResponseEntity<CleintDetailedDataDTO> Register(@RequestBody ClientDTO client, UriComponentsBuilder uriBuilder) {
        var user = clientService.CreateUser(client);

        var userUri = uriBuilder.path("/picpay/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(userUri).body(new CleintDetailedDataDTO(user));
    }

    @PutMapping
    public ResponseEntity<?> CreatePayment(@RequestBody TransactionDTO transaction) {
        return null;
    }


}
