package br.com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DockerSampleApplication {

	public static void main(final String... args) {
		SpringApplication.run(DockerSampleApplication.class, args);
	}

}
