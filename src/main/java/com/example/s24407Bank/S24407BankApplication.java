package com.example.s24407Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S24407BankApplication {

	private  BankService bankService;

	public S24407BankApplication(BankService bankService) {
		this.bankService = bankService;
	}



	public static void main(String[] args) {
		SpringApplication.run(S24407BankApplication.class, args);
	}

}
