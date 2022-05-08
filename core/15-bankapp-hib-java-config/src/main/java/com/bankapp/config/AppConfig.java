package com.bankapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.bankapp"})//<context:component-scan base-package="com.bankapp"/>

//<tx:annotation-driven transaction-manager="transactionManager"/>
public class AppConfig {

}
