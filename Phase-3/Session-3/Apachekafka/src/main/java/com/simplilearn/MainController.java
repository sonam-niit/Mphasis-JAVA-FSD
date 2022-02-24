package com.simplilearn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	private static final Logger logger= LoggerFactory.getLogger(Producer.class);
	
	@GetMapping("/send")
	public String sendMessage()
	{
		logger.info("####### Produced message: sending");
		this.kafkaTemplate.send("GENERAL", "HEllo Message From Kafka");
		
//		ListenableFuture<SendResult<String, String>> future= 
//				this.kafkaTemplate.send("GENERAL", "HEllo Message From Kafka");
//		future.addCallback(null, new ListenableFutureCallback<String>() {
//
//			@Override
//			public void onSuccess(String result) {
//				logger.info("message Sent");
//				
//			}
//
//			@Override
//			public void onFailure(Throwable ex) {
//				logger.info("error in sending a message");
//				
//			}
//		});
		
		return "check console";
	}
}
