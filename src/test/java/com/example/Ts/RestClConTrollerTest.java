package com.example.ts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.ts.repository.MockRepo;
import com.example.ts.service.MockService;
import com.example.ts.serviceimpl.MockServiceImpl;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class RestClConTrollerTest {
	
	@Mock
    private MockRepo mockRepo;
	
	@LocalServerPort
    int randomServerPort;

    @InjectMocks // auto inject helloRepository
    private MockService mockservice = new MockServiceImpl();

    //set repository data before get call service method
    @BeforeEach
    void setMockOutput() {
        when(mockRepo.get()).thenReturn("HEY MOCK");
    }

	  @Test
	    void getSayHello() throws URISyntaxException {
		  
		  	assertEquals("HEY MOCK",mockservice.get());
		  	
		  	//again test for api response
		 
		 	RestTemplate restTemplate = new RestTemplate();
	        final String baseUrl = "http://localhost:"+randomServerPort+"/hello";
	        URI uri = new URI(baseUrl);
	        
	        //below code for post api
	       // Employee employee = new Employee(null, "Adam", "Gilly", "test@email.com");
	       // HttpHeaders headers = new HttpHeaders();
	       // headers.set("X-COM-PERSIST", "true");      
	       // HttpEntity<Employee> request = new HttpEntity<>(employee, headers);
	        // ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
	         
	        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	         
	        //Verify request succeed
	        Assertions.assertEquals(200, result.getStatusCodeValue());
	    }
}
