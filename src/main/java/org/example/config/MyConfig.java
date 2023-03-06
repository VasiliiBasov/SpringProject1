package org.example.config;

import org.example.domain.Task;
import org.springframework.context.annotation.Bean;


public class MyConfig {
    @Bean
    public Task getTask() {
        return new Task();
    }
}
