package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.entity.Movie;
import com.abc.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	

    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(@RequestBody Movie message) {
    	movieService.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully as JSON");
    }
}
