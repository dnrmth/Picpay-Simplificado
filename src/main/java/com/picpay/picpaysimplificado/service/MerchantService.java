package com.picpay.picpaysimplificado.service;

import com.picpay.picpaysimplificado.repository.ClientRepository;
import com.picpay.picpaysimplificado.repository.MerchantRepository;
import org.springframework.stereotype.Service;

@Service
public class MerchantService {
    private final MerchantRepository merchantRepository;
    private final ClientRepository clientRepository;

    public MerchantService(MerchantRepository merchantRepository, ClientRepository clientRepository) {
        this.merchantRepository = merchantRepository;
        this.clientRepository = clientRepository;
    }

}
