package dk.krakow.world.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}

@RestController
@Slf4j
class HelloController {

	@GetMapping("/")
	public String getWorld() {
		log.info("Saying hello..");
		return "Hello World";
	}
}
