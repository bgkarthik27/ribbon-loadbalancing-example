package ch.karthi;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@SpringBootApplication
public class DisoveryClient_1 {

	@GetMapping(value = "/flux")
	public Flux<Integer> flux() throws InterruptedException {
		TimeUnit.SECONDS.sleep(60);
		return Flux.range(1, 1000);
	}

	public static void main(String[] args) {
		SpringApplication.run(DisoveryClient_1.class, args);
	}

}
