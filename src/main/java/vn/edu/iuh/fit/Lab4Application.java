package vn.edu.iuh.fit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab4Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab4Application.class, args);
	}

	@Bean
	public CommandLineRunner lineRunner(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {

			}
		};
	}

}
