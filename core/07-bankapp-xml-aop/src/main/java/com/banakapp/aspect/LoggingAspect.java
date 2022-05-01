package com.banakapp.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {
	private Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
	
	//@Before("execution(* com.banakapp.service.*.*(..))")
	public void beforeDemo() {
		System.out.println("public void beforeDemo is called : before");
	}
	
	//@After("execution(* com.banakapp.service.*.*(..))")
	public void afterDemo() {
		System.out.println("public void beforeDemo is called : After");
	}
	
	
	@AfterThrowing(pointcut = "execution(* com.banakapp.service.*.*(..))", throwing = "ex")
	public void afterAfterThrows(Exception ex) {
		System.out.println("-------------");
		System.out.println(ex.getMessage());
	}
	
	
	//  @Around("execution(* com.banakapp.service.*.*(..))")
	//@Around("@annotation(com.banakapp.service.MyLogger)")
	public Object applyLogging(ProceedingJoinPoint pjp) throws Throwable {
		long start=System.currentTimeMillis();
		
		Object result = pjp.proceed();// it is actually calling to BL
		
		long end= System.currentTimeMillis();
		long timeTaken= end-start;
		
		logger.info("time taken for method to execute is"+ timeTaken+": "+ pjp.getSignature().getName());
		return result;
	}
}
