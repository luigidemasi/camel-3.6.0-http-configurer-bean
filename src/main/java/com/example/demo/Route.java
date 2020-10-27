package com.example.demo;

import org.springframework.stereotype.Component;
import org.apache.camel.builder.RouteBuilder;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Component
public class Route extends RouteBuilder {

	@Override
	public void configure() {


		from("direct:get")
			.to("http://www.google.com");
	}
}
