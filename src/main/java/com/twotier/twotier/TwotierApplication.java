package com.twotier.twotier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.twotier")
public class TwotierApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwotierApplication.class, args);
	}

}
