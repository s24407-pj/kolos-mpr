package com.example.s24407Bank;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankServiceTests {

    private ClientStorage clientStorage;

    private TransferStorage transferStorage;


    private BankService bankService;

    //Add new client
    @Test
    void shouldAddNewClient(){
        bankService.registerClient(100);
        assertThat(clientStorage.getClientList()).hasSize(1);
    }


}

