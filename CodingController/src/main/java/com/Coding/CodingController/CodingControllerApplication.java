package com.Coding.CodingController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/greeting")
public class CodingControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingControllerApplication.class, args);
		
	}
	
    @RequestMapping("/coding")
    public String Coding(){
      return "¡Hola Coding Dojo!";
    }
    @RequestMapping("/Coding/python")
    public String python(){
      return "¡Python/Django fue increíble!";
    }
    @RequestMapping("/Coding/java")
    public String java(){
      return "¡Python/Django fue increíble!";
    }

}
