package com.mindtree.Transaction.service;

import org.springframework.stereotype.Component;
import org.springframework.jms.annotation.JmsListener;

@Component
public class Receiver {
	
	@JmsListener(destination = "TransactionQueue")
	public void receive(String transaction)
	{
		System.out.println(transaction);
		
		System.out.println("Message Received");
	}
}
