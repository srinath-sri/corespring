package com.simsa;

import org.springframework.beans.factory.annotation.Autowired;

public class Delll {
	
	private Disktype disktype;
	private Diskcapacity diskcapacity;
	
	@Autowired
	public void Setdisktype() {
		this.disktype=disktype;
	}
	@Autowired
	public void setdiskcapacity() {
		this.diskcapacity=diskcapacity;
	}
	

}
