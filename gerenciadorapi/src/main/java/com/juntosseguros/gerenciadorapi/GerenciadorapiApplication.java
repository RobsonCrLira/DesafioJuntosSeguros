package com.juntosseguros.gerenciadorapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/gerenciador")
@SpringBootApplication
public class GerenciadorapiApplication {

	public static void main(String[] args){
		SpringApplication.run(GerenciadorapiApplication.class,args);
	}
}
