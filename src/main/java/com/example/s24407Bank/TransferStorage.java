package com.example.s24407Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class TransferStorage {
    ArrayList<Transfer> transferList = new ArrayList<Transfer>();

    public TransferStorage() {

    }

    ArrayList<Transfer> getTransferList(){
        return transferList;
    }
}
