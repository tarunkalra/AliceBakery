package com.tarun.week1.AliceBakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceBakeryApplication implements CommandLineRunner {

	@Autowired
	CakeBaker cakeBaker;


	public static void main(String[] args) {
		SpringApplication.run(AliceBakeryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(cakeBaker.bakeCake());

    }

}
