package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    public String getUser(String userId) {
        return "this is the user " + userId + "!";
    }
}
