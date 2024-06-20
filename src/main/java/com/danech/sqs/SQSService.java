package com.danech.sqs;

import org.springframework.stereotype.Component;

import io.awspring.cloud.sqs.annotation.SqsListener;

@Component
public class SQSService {
	@SqsListener("myQueue")
	public void listen(String message) {
		System.out.println(message);
	}
}
