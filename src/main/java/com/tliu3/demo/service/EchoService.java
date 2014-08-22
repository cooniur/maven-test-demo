package com.tliu3.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EchoService {

	public String echo(String name) {
		return "Hello " + name;
	}
}
