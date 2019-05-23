package com.bryan.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.bryan.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
