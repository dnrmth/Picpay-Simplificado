package com.picpay.picpaysimplificado.controller;

import com.picpay.picpaysimplificado.dto.TransactionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/picpay")
public class PicPayController {

    @PostMapping("/register")
    public ResponseEntity<?> Register(ClientDTO client) {
        return null;
    }

    @PutMapping
    public ResponseEntity<?> CreatePayment(@RequestBody TransactionDTO transaction) {
        return null;
    }


}
