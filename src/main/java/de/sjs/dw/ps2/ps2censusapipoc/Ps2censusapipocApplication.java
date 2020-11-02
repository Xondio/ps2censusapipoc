package de.sjs.dw.ps2.ps2censusapipoc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Ps2censusapipocApplication {

	private static final Logger log = LoggerFactory.getLogger(Ps2censusapipocApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Ps2censusapipocApplication.class, args);
	}


	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
