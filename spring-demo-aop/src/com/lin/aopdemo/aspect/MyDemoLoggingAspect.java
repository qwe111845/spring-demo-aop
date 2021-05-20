package com.lin.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice

	@Before("execution( void addAccount(com.lin.aopdemo.*))")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on method");
		
	}
	
	@Before("execution(* com.lin.aopdemo.*.*.*(..))")
	public void beforeAddAccountAdvicePackage() {
		
		System.out.println("\n=====>>> Executing @Before advice on all method");
		
	}
}










