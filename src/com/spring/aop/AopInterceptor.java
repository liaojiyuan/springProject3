package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopInterceptor {
	//Before Adviceǰ��֪ͨ
	public void somethingBefore() {
		System.out.println("ǰ��֪ͨ�е��߼�............");
	}
	//After returing Advice ����֪ͨ
	public void somethingAfterReturn() {
		System.out.println("����֪ͨ���߼�.........");
	}
	/*
	 * ����֪ͨ�������������ӵ�ǰ�����һ�����ܣ�Ҳ���Դ����쳣
	 * @param point ����֪ͨ��������ӵ�еĲ������������ڴ�������ӵ�
	 * @return �������ӵ�Ӧ�÷��ص����ݣ�����������������ر������
	 * @throws Throwable�����ٷ��������ֹ������쳣
	 */
	public Object somethingAround(ProceedingJoinPoint point )throws Throwable{
		System.out.println("����֪ͨ��begin��");
		long time=System.currentTimeMillis();
		//ִ�����ӵ�
		Object obj=point.proceed();
		System.out.println("����֪ͨ��end������ʱ�䣺"+(System.currentTimeMillis()-time)/1000+"��");
		return obj;
	}

}
