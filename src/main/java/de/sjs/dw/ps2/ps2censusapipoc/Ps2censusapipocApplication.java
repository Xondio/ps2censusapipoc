package de.sjs.dw.ps2.ps2censusapipoc;

import de.sjs.dw.ps2.api.OutfitListMembersAllFields;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
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


//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			Quote quote = restTemplate.getForObject(
//					"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//			log.info(quote.toString());
//		};
//	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws  Exception{
		return args -> {
			OutfitListMembersAllFields outfitListMembersAllFields = restTemplate.getForObject(
					"https://census.daybreakgames.com/get/ps2:v2/outfit/?name=DRUCKWELLE&c:resolve=member_character",
					OutfitListMembersAllFields.class
			);

			//List<Member> members = outfitListMembersAllFields.getMembers();
			//log.info("DWHQ Members count " + members.size());


		};
	}
}
