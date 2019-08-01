package com.mphasis.mainpack;

import com.mphasis.emppack.Employee;
import com.mphasis.exceptionpack.InsuffecientLeaveException;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee(100, 16);
		
			try {
				employee.applyLeaveMethod(16);
			} catch (InsuffecientLeaveException e) {
				// TODO Auto-generatedcatch block
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
		

	}

}
