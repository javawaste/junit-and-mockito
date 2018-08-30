package com.cg.calculator.calculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import com.cg.calculator.service.CalculatorService;

public class TestCalculator {

	//stub
	/*CalculatorService service = new CalculatorService() {
		
		public int add(int i,int j) {
			return 0;
		}
	};*/
	
	CalculatorService service = Mockito.mock(CalculatorService.class);
	
	Calculator calculator = new Calculator(service);
	
	@Test
	public void testAdd() {
		when(service.add(2, 3)).thenR
		assertEquals(10,calculator.perform(2, 3));
	}

}
