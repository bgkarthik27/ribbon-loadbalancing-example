package ch.karthi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController
@SpringBootApplication
@RibbonClient(name = "discovery-client-1")
public class DisoveryClient_2 {

	@Autowired
	@LoadBalanced
	WebClient.Builder loadBalancedWebClientBuilder;

	@GetMapping(value = "/client2/flux")
	public Flux<Integer> flux() {
		return loadBalancedWebClientBuilder.build().get().uri("http://discovery-client-1/flux").retrieve().bodyToFlux(Integer.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DisoveryClient_2.class, args);
	}

	@Bean
	@LoadBalanced
	public WebClient.Builder loadBalancedWebClientBuilder() {
		return WebClient.builder();
	}

}
