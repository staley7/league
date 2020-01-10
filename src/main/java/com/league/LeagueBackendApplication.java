package com.league;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.league.repository")
public class LeagueBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeagueBackendApplication.class, args);
	}

}
