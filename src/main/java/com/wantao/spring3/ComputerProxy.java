package com.wantao.spring3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 *@author:wantao
 *@time:Jul 19, 2018 8:55:10 AM
 *@description:
 */
public class ComputerProxy {
	// 1.获取即将被代理对象
	private Computer computer;

	public ComputerProxy(Computer computer) {
		this.computer = computer;
	}

	// 2.已经被代理对象
	public Computer getComputerProxy() {
		ClassLoader loader = Computer.class.getClassLoader();
		Class[] interfaces = {Computer.class};
		InvocationHandler handler = new InvocationHandler() {

			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method.getName() + "被执行前");
				Object o=method.invoke(computer, args);
				System.out.println(method.getName() + "被执行后");
				return o;
			}
		};
		Computer computer = (Computer) Proxy.newProxyInstance(loader, interfaces, handler);
		return computer;
	}

}
