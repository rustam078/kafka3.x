package com.abc.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.abc.entity.Movie;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class MovieService {

	 private final KafkaTemplate<String, Movie> kafkaTemplate;

	    public void sendMessage(Movie movie) {

	        Message<Movie> message = MessageBuilder
	                .withPayload(movie)
	                .setHeader(KafkaHeaders.TOPIC, "movieTopic")
	                .build();

	        kafkaTemplate.send(message);
	    }
}
