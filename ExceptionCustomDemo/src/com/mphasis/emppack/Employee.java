package com.mphasis.emppack;

import com.mphasis.exceptionpack.InsuffecientLeaveException;

public class Employee {
	private int ssn;
	private int balanceLeave;
	public Employee(int ssn, int balanceLeave) {
		super();
		this.ssn = ssn;
		this.balanceLeave = balanceLeave;
	}
	@Override
	public String toString() {
		return "Employee [ssn=" + ssn + ", balanceLeave=" + balanceLeave + "]";
	}
	public void applyLeaveMethod(int appliedLeave) throws InsuffecientLeaveException {
		if(balanceLeave < appliedLeave) {
			throw new InsuffecientLeaveException("Not enough leave time available");
		}
		else {
			System.out.println("Leave sanctioned");
		}
	}
}
