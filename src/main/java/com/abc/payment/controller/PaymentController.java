package com.abc.payment.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/payment")
@CrossOrigin(origins = "*")
public class PaymentController {
	
	@GetMapping("/all")
	public String testProduct() {
		return "PRODUCT API";
	}	

}
