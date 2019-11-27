package com.popperdone.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
		System.out.println("    .___                    \n" +
				"  __| _/____   ____   ____  \n" +
				" / __ |/  _ \\ /    \\_/ __ \\ \n" +
				"/ /_/ (  <_> )   |  \\  ___/ \n" +
				"\\____ |\\____/|___|  /\\___  >\n" +
				"     \\/           \\/     \\/ ");
	}

}
