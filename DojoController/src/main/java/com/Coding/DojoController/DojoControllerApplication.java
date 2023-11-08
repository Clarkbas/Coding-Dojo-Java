package com.Coding.DojoController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DojoControllerApplication {
	@RequestMapping("/")
	public String index(@RequestParam(value="q",required = false) String searchQuery) {
		if(searchQuery == null) {
		} else {
		}
		return "Tu estas buscando: " + searchQuery;
	}

	public static void main(String[] args) {
		SpringApplication.run(DojoControllerApplication.class, args);
	}
	
    @RequestMapping("/dojo")
    public String showLesson1(){
    	return "¡El Dojo es increíble! ";
    }
    @RequestMapping("/burbank-dojo")
    public String showLesson2(){
    	return "El Dojo Burbank está localizado al sur de California";
    }
    @RequestMapping("/san-jose")
    public String showLesson3(){
    	return "El Dojo SJ es el cuartel general";
    }

}
