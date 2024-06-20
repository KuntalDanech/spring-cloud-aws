package com.danech.s3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import com.danech.SpringCloudAwsApplication;

@Component
public class S3Service {
	@Value("s3://spring-cloud-aws-s3/Spring_Cloud_AWS_S3.txt")
	private Resource resource;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAwsApplication.class, args);
	}

	public void read() throws IOException  {
		String fileData = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
		System.out.println(fileData);
	}
}
