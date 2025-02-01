package com.qspider.genericutility;

import java.time.LocalDateTime;


public class JavaUtility { 
	
	public String getSystemString() {
		
		 return LocalDateTime.now().toString().replace(":","-");
	}
	
	

}
