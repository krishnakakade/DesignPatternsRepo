package com.kk.mvc.controller;

import com.kk.mvc.model.Student;
import com.kk.mvc.view.StudentView;

public class StudentController {
	
	private Student model;
    private StudentView view;
	
	public StudentController(Student model,StudentView view)
	{
		this.model = model;
        this.view = view;		
	}

	public void setStudentName(String name)
	{
		model.setName(name);
	}
	
	public String getStudentName()
	{
		return model.getName();
	}
	
	public void setRollNo(String no)
	{
		model.setRollNo(no);
	}
	
	public String getRollNo()
	{
		return model.getRollNo();
	}
	
	public void updateView()
    {                
        view.printStudentDetails(model.getName(), model.getRollNo());
    }  
	
}
