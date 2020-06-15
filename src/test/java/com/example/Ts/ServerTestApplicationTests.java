package com.example.ts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;



@SpringBootTest(webEnvironment =WebEnvironment.RANDOM_PORT)
class ServerTestApplicationTests {

	String name="TAPAS";
	@Test
	void contextLoads() {
		assertEquals("TAPAS",name);
	}

}
