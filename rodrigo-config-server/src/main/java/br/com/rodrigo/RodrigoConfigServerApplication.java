package br.com.rodrigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RodrigoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RodrigoConfigServerApplication.class, args);
	}

}
