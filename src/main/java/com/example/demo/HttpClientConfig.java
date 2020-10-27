package com.example.demo;

import org.apache.camel.component.http.HttpClientConfigurer;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpClientConfig implements HttpClientConfigurer {

	@Override
	public void configureHttpClient(HttpClientBuilder clientBuilder) {
		System.out.println("config");
		clientBuilder.disableCookieManagement();
	}
}
