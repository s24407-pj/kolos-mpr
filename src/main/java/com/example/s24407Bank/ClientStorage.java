package com.example.s24407Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClientStorage {
    ArrayList<Client> clientList = new ArrayList<Client>();
    public ClientStorage() {

    }

    ArrayList<Client> getClientList(){
        return clientList;
    }
}
