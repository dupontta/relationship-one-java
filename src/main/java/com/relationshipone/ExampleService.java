package com.relationshipone;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Service
public class ExampleService {

	private final WebClient webClient;
	private static final String API_URL = "https://api.appcloud.relationshipone.com/appcloud/apps";

	public ExampleService() {
		this.webClient = WebClient.create(API_URL);
	}

	public Flux<App> getApps(int app) {
		return this.webClient.get().uri("?eloquapackageId=" + app).retrieve().bodyToFlux(App.class);
	}

	public void run() {
		ExampleService es = new ExampleService();
		es.getApps(153).collectList().block().forEach(System.out::println);
//		es.getApps(153).subscribe(System.out::println);
//      Thread.sleep(1000);
	}
}
