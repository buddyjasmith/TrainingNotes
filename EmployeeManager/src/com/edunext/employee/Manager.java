package com.edunext.employee;

import java.util.Date;

public class Manager extends Employee {
	private String currentProject;
	private Date projectStartDate;
	public Manager(int id,String name, double salary, String currentProject, String projectStartDate)
   {
		super(id, name, salary);
		setCurrentProject(currentProject);
		setProjectStartDate(projectStartDate);
	}
	public String getCurrentProject() {
		return currentProject;
	}
	public void setCurrentProject(String currentProject) {
		if(currentProject.length() != 4) throw new IllegalArgumentException();
		boolean check = true;
		for(int i = 0; i < 4; i++) 
		{
			switch(i) {
				case 0:	{
					 	if(!Character.isUpperCase(currentProject.charAt(i))) {
					 		check = false;
					 		throw new IllegalArgumentException();
							}
					 		break;
						}
				case 1:	if(!Character.isDigit(currentProject.charAt(i))) {
							check = false;
							throw new IllegalArgumentException();
						}
				case 2:	if(!Character.isDigit(currentProject.charAt(i))) {
							check = false;
							throw new IllegalArgumentException();
						}
				case 3:	if(!Character.isDigit(currentProject.charAt(i))) {
							check = false;
							throw new IllegalArgumentException();
						}
		    }
		}
	 
		if(check == true) 
			this.currentProject = currentProject;
		else return;
	}
	public Date getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(String possibleDate) {
		projectStartDate = Utilities.stringToDate(possibleDate);
	}
	

}
