package com.wantao.spring3;

/*
 *@author:wantao
 *@time:Jul 19, 2018 9:04:16 AM
 *@description:
 */
public class Main1 {
	public static void main(String[] args) {
		Computer computer = new ComputerImpl1();
		ComputerProxy proxy = new ComputerProxy(computer);
		computer = proxy.getComputerProxy();
		System.out.println(computer.add(1, 2));
	}

}
