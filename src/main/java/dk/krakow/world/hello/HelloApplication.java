package dk.krakow.world.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class HelloApplication {
	@GetMapping("/")
	public String getWorld() {
		log.info("Saying hello..");
		return "Brave new World!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
