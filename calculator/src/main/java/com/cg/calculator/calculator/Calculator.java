package com.cg.calculator.calculator;

import com.cg.calculator.service.CalculatorService;

public class Calculator {

	//interface connecting with cloud service which is already tested
	CalculatorService service;
	
	public Calculator(CalculatorService service) {
		this.service=service;
	}
	
	public int perform(int i,int j) 
	{    
		//2 3 -> (i+j)*i
		return service.add(i, j)*i;
	}
}
