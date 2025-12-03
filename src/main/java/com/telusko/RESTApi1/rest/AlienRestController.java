package com.telusko.RESTApi1.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienRestController 
{
	@PostMapping("/addalien")
	public ResponseEntity<String> addAlienInfo(@RequestBody Alien alien)
	{
		System.out.println(alien);
		String body="Alien Data added";
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
}
