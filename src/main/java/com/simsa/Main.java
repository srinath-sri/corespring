package com.simsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ab=new ClassPathXmlApplicationContext("beans.xml");
		Diskcapacity dc=ab.getBean("diskcapacity" ,Diskcapacity.class);
		dc.showdiskcapacitydetails();
		Disktype dt=ab.getBean("disktype", Disktype.class);
		dt.showdiskdetails();
		dt.showdiskname();
		
	}

}
