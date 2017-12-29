package com.iqmsoft.impl;

import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.iqmsoft.service.PingService;

@Service
//@Transactional
public class PingServiceImpl implements PingService {
	
	public String sayHello(String a) {
        return "Hello " + a + ", Welcome to CXF RS Spring Boot World!!!";
    }
	
	public String ping() {
        return "Ping... Welcome to JAX RS Spring Boot World!!!";
    }
	
}
