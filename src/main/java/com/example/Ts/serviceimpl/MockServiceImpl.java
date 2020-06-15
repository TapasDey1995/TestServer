package com.example.ts.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ts.repository.MockRepo;
import com.example.ts.service.MockService;

public class MockServiceImpl implements MockService{
	
	@Autowired
	private MockRepo mockRepo;
	@Override
    public String get() {
        return mockRepo.get();
    }
}
