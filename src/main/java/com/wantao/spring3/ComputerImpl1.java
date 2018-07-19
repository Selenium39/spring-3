package com.wantao.spring3;

import org.springframework.stereotype.Component;

/*
 *@author:wantao
 *@time:Jul 19, 2018 8:53:54 AM
 *@description:
 */
@Component
public class ComputerImpl1 implements Computer{

	public int add(int a, int b) {
		int result=a+b;
		return result;
	}

	public int sub(int a, int b) {
		int result=a-b;
		return result;
	}

	public int mul(int a, int b) {
		int result=a*b;
		return result;
	}

	public int div(int a, int b) {
		int result=a/b;
		return result;
	}

}
