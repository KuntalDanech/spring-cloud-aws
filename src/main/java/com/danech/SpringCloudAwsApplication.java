package com.danech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class SpringCloudAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAwsApplication.class, args);
	}

}
