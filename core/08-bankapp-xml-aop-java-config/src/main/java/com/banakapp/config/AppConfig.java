package com.banakapp.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@ComponentScan(basePackages = {"com.banakapp"})
@EnableAspectJAutoProxy
public class AppConfig {

}
