package com.simsa;

import org.springframework.beans.factory.annotation.Autowired;

public class Hp {

	private Disktype disktype;
	private Diskcapacity diskcapacity;

	@Autowired
	public void setDisktype(Disktype disktype) {
		this.disktype = disktype;
	}
	
	@Autowired
	public void setDiskcapacity(Diskcapacity diskcapacity) {
		this.diskcapacity = diskcapacity;
	}

}
