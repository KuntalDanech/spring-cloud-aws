package com.danech.secretsmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SecretsmanagerService {
	
	@Value("${rag-db-cred}")
	private String secretKey;

	public void secretsManger() {
		System.out.println(secretKey);
	}

}