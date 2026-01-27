package com.misael.backend;

import org.springframework.boot.SpringApplication;

public class TestBalanceApplication {

	public static void main(String[] args) {
		SpringApplication.from(BalanceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
