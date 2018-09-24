package dk.krakow.world.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
@Slf4j
public class HelloApplication {

	@Value("${HELLO_MESSAGE:Hello World..}")
	private String message;

	@Value("${HOSTNAME:localhost}")
	private String hostname;

	@GetMapping("/")
	public String getWorld() {
		log.info("Saying hello..");
		return "["+new Date()+"] :I am "+hostname+", "+message;
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
