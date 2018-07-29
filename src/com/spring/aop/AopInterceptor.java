package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopInterceptor {
	//Before Advice前置通知
	public void somethingBefore() {
		System.out.println("前置通知中的逻辑............");
	}
	//After returing Advice 后置通知
	public void somethingAfterReturn() {
		System.out.println("后置通知的逻辑.........");
	}
	/*
	 * 环绕通知，可以再在连接点前后都完成一定功能，也可以处理异常
	 * @param point 环绕通知方法可以拥有的参数，代表正在处理的连接点
	 * @return 返回连接点应该返回的内容，或者在这里决定返回别的内容
	 * @throws Throwable可以再方法体中手工处理异常
	 */
	public Object somethingAround(ProceedingJoinPoint point )throws Throwable{
		System.out.println("环绕通知：begin：");
		long time=System.currentTimeMillis();
		//执行连接点
		Object obj=point.proceed();
		System.out.println("环绕通知，end，消耗时间："+(System.currentTimeMillis()-time)/1000+"秒");
		return obj;
	}

}
