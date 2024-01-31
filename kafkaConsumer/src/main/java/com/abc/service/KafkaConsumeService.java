package com.abc.service;

import static java.lang.String.format;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.abc.entity.Movie;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumeService {
    @KafkaListener(topics = "movieTopic", groupId = "myGroup")
    public void consumeJsonMsg(Movie movie) {
        log.info(format("Consuming the message from alibou Topic:: %s", movie));
    }
}
