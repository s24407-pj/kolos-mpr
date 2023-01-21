package com.example.s24407Bank;

public class Transfer {
    private static int count = 0;
    private final int id;
    private final int clientId;
    private Double amount;
    private TransferStatus status;
    private final TransferType type;

    private Double newBalance;
    public Transfer(int clientId,Double amount,TransferStatus status,Double newBalance,TransferType type) {
        this.id = count++;
        this.amount = amount;
        this.clientId = clientId;
        this.status = status;
        this.newBalance = newBalance;
        this.type = type;
    }
}
