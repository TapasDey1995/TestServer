package com.example.ts.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MockRepo {
	
	public String get() {
        return "Hello";
    }
}
