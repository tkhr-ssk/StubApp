package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.StubResponse;

@RestController
public class StubRestController {
	@RequestMapping(value = "/api", method = RequestMethod.POST)
	public StubResponse stubApi() {
		StubResponse response = new StubResponse();
		response.setResult("success");
		return response;
	}

}
