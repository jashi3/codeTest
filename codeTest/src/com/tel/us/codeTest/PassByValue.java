package com.tel.us.codeTest;

public class PassByValue {
	
	 int data=50;  
	  
	 void change(int data){  
	 data=data+100;    //changes will be in the local variable, variable in change scope only. default data will be 50 unless we mention this keyword.  
	 } 
	 
	 void change(PassByValue pv){  
		 pv.data=data+100;    //changes will be in the local variable, variable in change scope only. default data will be 50 unless we mention this keyword.  
		 }

}
