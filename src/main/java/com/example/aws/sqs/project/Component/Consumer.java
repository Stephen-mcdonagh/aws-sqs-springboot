package com.example.aws.sqs.project.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

	@SqsListener("springboot-test-queue")
	public void receiveMessage(String stringJson) {

		logger.info("Message Received using SQS Listner " + stringJson);

	}
}
