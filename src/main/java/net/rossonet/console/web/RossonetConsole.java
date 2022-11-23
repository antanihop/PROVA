package net.rossonet.console.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("net.rossonet.console")
@SpringBootApplication
public class RossonetConsole {

	public static void main(final String[] args) {
		SpringApplication.run(RossonetConsole.class, args);
	}

}
