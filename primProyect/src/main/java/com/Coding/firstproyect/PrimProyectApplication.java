package com.Coding.firstproyect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimProyectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimProyectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Bienvenido al mundo de Clarkcito";
	}
	
	@RequestMapping("/Random")
	public String msmHow() {
		return "Como esta querido explorador?";
	}

}
