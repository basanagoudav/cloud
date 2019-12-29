package com.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@RestController
@RequestMapping("/employeeGreetings")
public class GreetingController {
    @Value("${server.port}")
    private String port;
	
    @GetMapping
	public String greeting() {
        return "Hello you are welcome, i am serving you at port : "+port;
        return "Hello you are welcome, i am serving you at port : "+port;
        return "Hello you are welcome, i am serving you at port : "+port;
        return "Hello you are welcome, i am serving you at port : "+port;
    }

}
