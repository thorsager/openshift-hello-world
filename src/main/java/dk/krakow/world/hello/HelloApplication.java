package dk.krakow.world.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class HelloApplication {

	@Value("${HELLO_MESSAGE:Hello World..}")
	private String message;

	@GetMapping("/")
	public String getWorld() {
		log.info("Saying hello..");
		return message;
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
