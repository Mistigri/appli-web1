package com.wha.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DoAroundMethod implements MethodInterceptor {
	
	public Object invoke (MethodInvocation methodInvocation) throws Throwable {
		System.out.println("******SPRING AOP**** DoAroundMethod : Method name : "+ methodInvocation.getMethod().getName());
		System.out.println("******SPRING AOP**** DoAroundMethod : Method arguments : "+ Arrays.toString(methodInvocation.getArguments()));
		System.out.println("******SPRING AOP**** DoAroundMethod :Before method executing !");
		
		try {
			//proceed to original method
			Object result = methodInvocation.proceed();
			//same with AfterReturningAdvice
			System.out.println("**********SPRING AOP****** DoAroundMethod : After method executing ! ");
			return result;
		}
		//same with ThrowsAdvice
		catch(IllegalAccessException e) {
			System.out.println("*********SPRING AOP********* DoAroundMethod : When method throws Exception ! ");
			throw e;
		}		
	}
}
