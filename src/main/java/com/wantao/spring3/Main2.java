package com.wantao.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@author:wantao
 *@time:Jul 19, 2018 10:03:05 AM
 *@description:
 */
public class Main2 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring3.xml");
		Computer computer = (Computer) ac.getBean("computerImpl1");
		System.out.println(computer.div(1, 1));
	}
}
