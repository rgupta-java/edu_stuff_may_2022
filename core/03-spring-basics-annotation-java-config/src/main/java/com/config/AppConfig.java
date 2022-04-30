package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration	//hey i want to take this class a a config class
@ComponentScan(basePackages = {"com.demo"})
public class AppConfig {
}
