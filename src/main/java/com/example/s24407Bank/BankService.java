package com.example.s24407Bank;

import org.springframework.stereotype.Component;

@Component
public class BankService {
    private final ClientStorage clientStorage;
    private final TransferStorage transferStorage;

    public BankService(ClientStorage clientStorage, TransferStorage transferStorage) {
        this.clientStorage = clientStorage;
        this.transferStorage = transferStorage;
        System.out.println("App is running");
    }

    //Register new client and add it to clientStorage
    public void registerClient(double balance){
        clientStorage.getClientList().add(new Client(balance));
        System.out.println("Client added.");
    }

    //Create new transfer from our client with specified amount,
    public Transfer newTransfer(int clientId,Double amount){
        for(Client client: clientStorage.getClientList()){
            if(client.getId()==clientId){
                Double newBalance = client.minusBalance(amount);
                if(newBalance<0){
                    System.out.println("Balance is too low.");
                    //Give back money on acc
                    client.plusBalance(amount);
                    return null;
                }else{
                Transfer transfer = new Transfer(clientId, amount,TransferStatus.ACCEPTED,newBalance,TransferType.MINUS);
                transferStorage.getTransferList().add(transfer);
                return transfer;
                }
            }
        }

       return null;
    }

    //Add cash to client balance
    public Transfer addCash(int clientId,Double amount){
        for(Client client: clientStorage.getClientList()){
            if(client.getId()==clientId){
                Double newBalance = client.plusBalance(amount);
                Transfer transfer = new Transfer(clientId, amount,TransferStatus.ACCEPTED,newBalance,TransferType.PLUS);
                transferStorage.getTransferList().add(transfer);
                System.out.println("Transfer done correctly.");
                return transfer;
            }else{
                System.out.println("No such client.");
                return null;}
        }
        return null;
    }

    public String showAccInfo(int clientId){
        for(Client client: clientStorage.getClientList()){
            if(client.getId()==clientId){
                return String.valueOf(client);
            }else{return null;}
        }
        return null;
    }
}
