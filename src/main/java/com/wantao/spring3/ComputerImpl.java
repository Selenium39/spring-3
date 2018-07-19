package com.wantao.spring3;

/*
 *@author:wantao
 *@time:Jul 19, 2018 8:49:26 AM
 *@description:
 */
//不使用代理
public class ComputerImpl implements Computer {

	public int add(int a, int b) {
		System.out.println("加方法调用前");
		int result = a + b;
		System.out.println("加方法调用后");
		return result;
	}

	public int sub(int a, int b) {
		System.out.println("减方法调用前");
		int result = a - b;
		System.out.println("减方法调用后");
		return result;
	}

	public int mul(int a, int b) {
		System.out.println("乘方法调用前");
		int result = a * b;
		System.out.println("乘方法调用后");
		return result;
	}

	public int div(int a, int b) {
		System.out.println("除方法调用前");
		int result = a / b;
		System.out.println("除方法调用后");
		return result;
	}

}
