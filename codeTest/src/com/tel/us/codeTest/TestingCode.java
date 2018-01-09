package com.tel.us.codeTest;

public class TestingCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("testing done");
		
		Employee emp = new Employee(3);
		
		emp.show();
		//System.out.println("testing done - "+emp.show());
		
		PassByValue pValue = new PassByValue();
		 System.out.println("before change "+pValue.data);  
		 pValue.change(500);  
		 System.out.println("after change "+pValue.data); 
		 
		 
		 // now pass by Object
		 pValue.change(pValue);
		 System.out.println("after change "+pValue.data); 
		 
		 
		     
		System.out.println("factorial value -"+factorial(5));
		 

	}
	
	 static int factorial(int n){     
		 //System.out.println("round - "+n);
         if (n == 1)      
           return 1;      
         else      
           return(n * factorial(n-1));      
   }

}



