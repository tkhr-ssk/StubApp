package com.example.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StubResponse {
	@JsonProperty("result")
	String result;
}
