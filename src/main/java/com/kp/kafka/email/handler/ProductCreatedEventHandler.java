package com.kp.kafka.email.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.kp.kafka.core.bean.ProductCreatedEvent;

@Component
@KafkaListener(topics = "product-created-events-topic")
public class ProductCreatedEventHandler {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@KafkaHandler
	public void handle(ProductCreatedEvent productEvent) {
		logger.info("Product title: "+ productEvent.getTitle());
		logger.info("ProductId: "+ productEvent.getProductId());
	}
}
