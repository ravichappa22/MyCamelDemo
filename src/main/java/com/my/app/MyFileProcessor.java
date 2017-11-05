package com.my.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class MyFileProcessor{
//extends RouteBuilder{

	/*@Override
	public void configure() throws Exception {
		from("jms:invoices").to("file:/invoices");
		
	}*/
	
	public void readfile(){
		System.out.println("reading file");
		Path path = Paths.get("C://target/");
		
		System.out.println(path.iterator().next());
		
		
		
		String file = "C://target/myfile.txt";
		
			try (Stream<String> stream = Files.lines(Paths.get(file))) {
				stream.forEach(System.out::println);

			} catch (IOException e) {
				e.printStackTrace();
			}			
			
		}
	}

