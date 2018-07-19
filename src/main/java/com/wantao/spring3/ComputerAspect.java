package com.wantao.spring3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 *@author:wantao
 *@time:Jul 19, 2018 9:47:40 AM
 *@description:
 */
@Aspect  //定义为切面
@Component
public class ComputerAspect {
	//重用切点表达式
	@Pointcut("execution(public * com.wantao.spring3.ComputerImpl1.*(..))")
	public void getExecution() {	
	}
	
	
	//定义为前置通知(切点表达式)
	//@Before("execution(public int com.wantao.spring3.ComputerImpl1.add(int, int))")
	@Before("execution(public * com.wantao.spring3.ComputerImpl1.*(..))")
	public void a(JoinPoint jp) {//如果想获得连接点具体参数,出入JoinPoint对象
		System.out.println("方法名称:"+jp.getSignature().getName());
		System.out.println("方法执行前");
	}
	//定义为后置通知(切点表达式)
	//@After("execution(public int com.wantao.spring3.ComputerImpl1.add(int, int))")
	@After("getExecution()")//使用重用切点表达式
	public void b() {
		System.out.println("方法执行后");
	}
	@AfterReturning("execution(public * com.wantao.spring3.ComputerImpl1.*(..))")
	//如果需要方法返回值，加上returing="result"
	public void c() {
		System.out.println("方法正确执行后");
	}
	@AfterThrowing(pointcut="execution(public * com.wantao.spring3.ComputerImpl1.*(..))",throwing="ex")
	public void d(Exception ex) {
		System.out.println(ex.getMessage());
	}
	//环绕通知:@Around

}
