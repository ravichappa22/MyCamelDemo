package com.my.app;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FilePoller extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:\\inputdir?delete=true&consumer.delay=10000&consumer.initialDelay=5000").to("file:C:\\target")
		.onCompletion().bean(MyFileProcessor.class, "readfile");
	}
	
}	