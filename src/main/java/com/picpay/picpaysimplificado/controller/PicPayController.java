package com.picpay.picpaysimplificado.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/picpay")
public class PicPayController {

    @PutMapping
    public ResponseEntity<?> pay() {
        return null;
    }

}
