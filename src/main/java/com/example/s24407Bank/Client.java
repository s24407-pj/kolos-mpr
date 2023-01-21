package com.example.s24407Bank;

public class Client {
    private static int count = 0;
    private final int id;
    private Double balance;

    public Client( Double balance) {
        this.id = count++;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Double minusBalance(Double amount){
        this.balance-= amount;
        return this.balance;
    }

    public Double plusBalance(Double amount){
        this.balance+= amount;
        return this.balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "balance=" + balance +
                '}';
    }
}
