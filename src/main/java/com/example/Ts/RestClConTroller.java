package com.example.Ts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestClConTroller {
	@GetMapping("/hello")
    public String sayHello() {
        return "hello Tapas";
    }
}