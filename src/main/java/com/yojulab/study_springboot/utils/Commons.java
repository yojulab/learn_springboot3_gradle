package com.yojulab.study_springboot.utils;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class Commons {
    public String getUniqueSequence() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }    
}