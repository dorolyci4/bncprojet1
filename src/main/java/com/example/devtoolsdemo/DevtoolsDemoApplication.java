package com.example.devtoolsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DevtoolsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevtoolsDemoApplication.class, args);
	}

	@RestController
	public static  class MyController {

		@GetMapping("/hello1")
		String salutaion1(){
			return "Hello World1 \n";
		}
		@GetMapping("/salut")
		String salutaion2(){
			return "Salut World \n";
		}


	}

}
