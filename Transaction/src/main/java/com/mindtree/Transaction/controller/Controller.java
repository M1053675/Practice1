package com.mindtree.Transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Transaction.entity.Transaction;

@RestController
public class Controller {
	
	@Autowired
	private JmsTemplate jmstemplate;
	
	@PostMapping("/send")
	public void send(@RequestBody Transaction transaction)
	{
		System.out.println("Sending a transaction");
		jmstemplate.convertAndSend("TransactionQueue",transaction.toString());
	}
}
