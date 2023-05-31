package io.gilMUzikaBrains.courseapidata_sringBoot_web_app_with_DB_connection_22_05_23;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/*
Instructions:
https://www.youtube.com/watch?v=vovvcvcUkVI
*/

@SpringBootApplication
public class CourseApiDataSpringBootWebAppWithDbConnection220523Application {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiDataSpringBootWebAppWithDbConnection220523Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("We did it");
		};
	}

}
