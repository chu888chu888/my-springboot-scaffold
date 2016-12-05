package com.chu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@ServletComponentScan
@SpringBootApplication
public class SpringbootScaffoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootScaffoldApplication.class, args);
	}
}
