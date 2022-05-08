package com.bankapp.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.bankapp"})//<context:component-scan base-package="com.bankapp"/>
@EnableAspectJAutoProxy //<aop:aspectj-autoproxy/>
@PropertySource("classpath:db.properties")//<context:property-placeholder location="classpath:db.properties"/>
@EnableTransactionManagement //<tx:annotation-driven transaction-manager="transactionManager"/>
public class AppConfig {
	
	@Value("${jdbc.driver}")
	private String driverName;

	@Value("${jdbc.url}")
	private String url;

	@Value("${jdbc.username}")
	private String username;

	@Value("${jdbc.password}")
	private String password;

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(url);
		dataSource.setDriverClassName(driverName);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean(DataSource dataSource) {
		LocalSessionFactoryBean lsfactory=new LocalSessionFactoryBean();
		lsfactory.setDataSource(dataSource);
		lsfactory.setPackagesToScan(new String[] {"com.bankapp.entities"});
		lsfactory.setHibernateProperties(getHibernateProperties());
		return lsfactory;
	}
	
	private Properties getHibernateProperties() {
		Properties properties=new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		
		return properties;
	}

	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager hibTxMgr=new HibernateTransactionManager();
		hibTxMgr.setSessionFactory(sessionFactory);
		return hibTxMgr;
	}
}


